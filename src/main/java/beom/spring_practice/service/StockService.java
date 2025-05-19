package beom.spring_practice.service;

import beom.spring_practice.config.ApiTokenManager;
import beom.spring_practice.dto.ApiResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.Map;

public class StockService {

    private final WebClient webClient;
    private final ApiTokenManager apiTokenManager;
    private final String appKey;
    private final String appSecret;
    private final String TR_ID = "FHKST01010100";
    private final String CUSTTYPE = "P";


    public StockService(WebClient webClient, ApiTokenManager apiTokenManager) {
        this.webClient = webClient;
        this.apiTokenManager = apiTokenManager;
        this.appKey = apiTokenManager.getAppKey();
        this.appSecret = apiTokenManager.getAppSecret();
    }

    public String getToken() {
        return apiTokenManager.getAccessToken();
    }

    public ApiResponseBody inquirePrice(String fidInputIscd) {
        String accessToken = apiTokenManager.getAccessToken();
        ApiResponseBody apiResponseBody = webClient.post()
                .uri(uriBuilder -> uriBuilder.path("/uapi/domestic-stock/v1/quotations/inquire-price")
                        .queryParam("FID_COND_MRKT_DIV_CODE", "J")
                        .queryParam("FID_INPUT_ISCD", fidInputIscd)
                        .build())
                .contentType(MediaType.valueOf("application/json; charset=utf-8"))
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken)
                .header("appkey", appKey)
                .header("appsecret", appSecret) // API 명세에는 있지만, 보안상 매우 이례적. 재확인 필요.
                .header("tr_id", TR_ID)
                .header("custtype", CUSTTYPE)
                .retrieve() // 요청 보내고, 성공하면 응답 바디를 가져올 준비를 하고, 실패하면 예외를 던짐
                .bodyToMono(ApiResponseBody.class)
                .block();

        System.out.println("현재가 조회");
        return apiResponseBody;
    }
}
