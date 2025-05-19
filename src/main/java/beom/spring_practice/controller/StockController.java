package beom.spring_practice.controller;

import beom.spring_practice.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        stockService.getAccessToken();
        return "stock/home";
    }

    @GetMapping("/current-price")
    public String currentPriceForm() {
        return "stock/currentPriceForm";
    }

    @PostMapping("/current-price")
    public String getCurrentPrice() {
        return "stock/currentPrice";
    }
}
