package beom.spring_practice.controller;

import beom.spring_practice.domain.Member;
import beom.spring_practice.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    /**
     * get으로 들어갈때는 빈 폼 데이터를 전달해서 아무것도 채우지 않은 상태로 감.
     */
    @GetMapping("/members/signUp")
    public String signupForm(Model model) {
        model.addAttribute("memberSignUpForm", new MemberSignUpForm());
        return "/members/signUpForm";
    }

    /**
     * post로 들어가면 회원가입을 실행하고, 예외가 발생했다면 입력한 정보와 예외 메시지를 가지고 다시 그 페이지로 포워드
     */
    @PostMapping("/members/signUp")
    public String signup(@ModelAttribute MemberSignUpForm memberSignUpForm, Model model) {
        Member member = new Member();
        member.setEmail(memberSignUpForm.getEmail());
        member.setPassword(memberSignUpForm.getPassword());
        member.setPhoneNumber(memberSignUpForm.getPhoneNumber());
        member.setFullName(memberSignUpForm.getFullName());
        try {
            memberService.join(member);
            return "redirect:/members/signIn";
        } catch (IllegalStateException e) {
            // 비밀번호는 민감한 정보이기 때문에 빈 문자열로 바꿔서 전달
            memberSignUpForm.setPassword("");
            // 예외 메시지를 모델에 담아서 회원가입 폼 페이지에 전달
            model.addAttribute("errorMessage", e.getMessage());
            // 기존에 입력했던 값도 함께 유지할 수 있음
            model.addAttribute("memberSignUpForm", memberSignUpForm);
            return "/members/signUpForm"; // 다시 회원가입 화면으로 포워드
        }
    }

    @GetMapping("/members/signIn")
    public String signInForm() {
        return "/members/signInForm";
    }

}
