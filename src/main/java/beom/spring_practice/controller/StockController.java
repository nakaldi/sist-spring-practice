package beom.spring_practice.controller;

import beom.spring_practice.config.ApiTokenManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class StockController {

    private final ApiTokenManager apiTokenManager;

    public StockController(ApiTokenManager apiTokenManager) {
        this.apiTokenManager = apiTokenManager;
    }

    @GetMapping("/get-access-token")
    public String getApiToken() {
        apiTokenManager.getAccessToken();
        return "home";
    }
}
