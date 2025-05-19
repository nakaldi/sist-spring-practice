package beom.spring_practice.service;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.time.LocalDateTime;
import java.util.Map;

public class StockService {

    private final WebClient authWebClient;
    private String accessToken;
    private LocalDateTime createdAt;

    @Value("${stock-api.appkey}") // application.properties에서 고유키 주입
    private String appKey;

    @Value("${stock-api.appsecret}")
    private String appSecret;

    public StockService(WebClient.Builder authWebClientBuilder) {
        this.authWebClient = authWebClientBuilder
                .baseUrl("https://openapivts.koreainvestment.com:29443") // 토큰 발급 서버 URL 설정
                .build();
    }

    public void getCurrentPrice() {
        return;
    }
    /**
     * API 요청을 위한 액세스 토큰을 받아옴. 액세스 토큰은 싱글톤 방식으로 관리됨.
     * 액세스 토큰을 요청한지 6시간이 지났으면, 액세스 토큰을 외부 API에 새롭게 요청해 발급받음.
     *
     * @return API 액세스 토큰
     */
    public String getAccessToken() {
        if (accessToken == null || LocalDateTime.now().isAfter(createdAt.plusHours(6))) {
            System.out.println("토큰이 없거나 발급한지 6시간이 경과함, 새로운 토큰 요청");
            requestAccessToken();
        }
        System.out.println(createdAt + " 에 생성된 토큰 반환 : " + accessToken.substring(0, 10) + "...");
        return accessToken;
    }

    private void requestAccessToken() {
        System.out.println("Requesting new token");

        try {
            JsonNode responseNode = this.authWebClient.post()
                    .uri("/oauth2/tokenP")
                    .bodyValue(Map.of("grant_type", "client_credentials", "appkey", appKey, "appsecret", appSecret))
                    .retrieve() // 요청 보내고, 성공하면 응답 바디를 가져올 준비를 하고, 실패하면 예외를 던짐
                    .bodyToMono(JsonNode.class) // 응답을 JsonNode 객체로 변환
                    .block();

            if (responseNode != null && responseNode.has("access_token")) {
                String newAccessToken = responseNode.get("access_token").asText(); // 타입 안전하게 텍스트로 가져옴
                this.accessToken = newAccessToken;
                this.createdAt = LocalDateTime.now();
                System.out.println(createdAt + " 에 새로운 토큰 발급 : " + newAccessToken);

            } else {
                throw new RuntimeException("Failed to refresh API token or access_token not found in response");
            }
        } catch (WebClientResponseException e) {
            System.out.println("API 호출 중 에러 발생!");
            System.out.println("Status Code: " + e.getStatusCode());
            String errorBody = e.getResponseBodyAsString();
            System.out.println("Error Body: " + errorBody);
            throw new RuntimeException("API 호출 실패: " + errorBody, e);
        } catch (Exception e) {
            throw new RuntimeException("Error during token refresh: " + e.getMessage(), e);
        }
    }
}
