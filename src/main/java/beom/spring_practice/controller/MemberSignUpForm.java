package beom.spring_practice.controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class MemberSignUpForm {

    @NotBlank(message = "이메일은 필수입니다.")
    @Email(message = "유효한 이메일 형식을 입력해 주세요.")
    private String email;

    @NotBlank(message = "비밀번호는 필수입니다.")
    @Size(min = 8, max = 20, message = "비밀번호는 8자 이상 20자 이하이어야 합니다.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d).+$",
            message = "비밀번호는 문자와 숫자를 모두 포함해야 합니다.")
    private String password;  // 반드시 암호화 적용!

    @NotBlank(message = "이름은 필수입니다.")
    @Size(min = 2, max = 100, message = "이름은 2글자 이상 100글자 이하이어야 합니다.")
    private String fullName;

    @NotBlank(message = "전화번호는 필수입니다.")
    // 예를 들어, 전화번호는 10자 또는 11자로 입력하도록 제한
    @Pattern(regexp = "^\\d{10,11}$", message = "전화번호는 10자 또는 11자로 입력해 주세요.")
    private String phoneNumber;

    public MemberSignUpForm() {
    }

    public MemberSignUpForm(String email, String password, String fullName, String phoneNumber) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
