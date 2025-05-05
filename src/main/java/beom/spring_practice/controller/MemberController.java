package beom.spring_practice.controller;

import beom.spring_practice.domain.Member;
import beom.spring_practice.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/signUp")
    public String signupForm() {
        return "/members/signUpForm";
    }

    @PostMapping("/members/signUp")
    public String signup(MemberSignUpForm memberSignUpForm) {
        Member member = new Member();
        member.setEmail(memberSignUpForm.getEmail());
        member.setPassword(memberSignUpForm.getPassword());
        member.setPhoneNumber(memberSignUpForm.getPhoneNumber());
        member.setFullName(memberSignUpForm.getFullName());

        memberService.join(member);
        return "redirect:/members/signIn";
    }

    @GetMapping("/members/signIn")
    public String signInForm() {
        return "/members/signInForm";
    }

}
