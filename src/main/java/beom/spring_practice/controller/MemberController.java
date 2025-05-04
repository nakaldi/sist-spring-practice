package beom.spring_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/members/signUp")
    public String signupForm() {
        return "/members/signUpForm";
    }

    @GetMapping("/members/signIn")
    public String signInForm() {
        return "/members/signInForm";
    }

}
