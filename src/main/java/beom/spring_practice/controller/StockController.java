package beom.spring_practice.controller;

import beom.spring_practice.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Controller
@RequestMapping("/stock")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/home")
    public String stockHome() {
        return "stock/home";
    }

    @GetMapping("/get-access-token")
    public String getApiToken() {
        stockService.getToken();
        return "stock/home";
    }

    @GetMapping("/current-price")
    public String currentPriceForm() {
        return "stock/currentPriceForm";
    }

    @PostMapping("/current-price")
    public String getCurrentPrice(@RequestParam String fidInputIscd, Model model) {
        try {
            // 모델에 DTO 추가 (타임리프에서 이 이름으로 접근)
            model.addAttribute("stockData", stockService.inquirePrice(fidInputIscd));
        } catch (WebClientResponseException e) {
            model.addAttribute("errorMessage", "API 서버 오류" + e.getMessage());
        } catch (Exception e) {
            // API 호출 실패 또는 다른 예외 발생 시 에러 메시지 전달
            model.addAttribute("errorMessage", "주식 정보를 조회하는 중 오류가 발생했습니다: " + e.getMessage());
        }
        return "stock/currentPrice";
    }
}
