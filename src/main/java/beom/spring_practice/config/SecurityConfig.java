package beom.spring_practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // PasswordEncoder 빈 등록 (BCrypt 기반)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Spring Security 6에 맞춘 SecurityFilterChain 설정
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // CSRF 보호는 필요한 상황에 맞게 적용하세요.
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        // 회원가입, 로그인 페이지 및 정적 자원은 누구나 접근 가능
                        .requestMatchers("/members/signUp", "/members/signIn", "/css/**", "/js/**", "/img/**").permitAll()
                        // 그 외의 모든 요청은 인증 필요
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        // 커스텀 로그인 페이지 URL (GET 요청)
                        .loginPage("/members/signIn")
                        // 로그인 처리 URL (POST 요청)
                        .loginProcessingUrl("/members/signIn")
                        // 로그인 성공 후 이동할 기본 URL (두번째 인자 true: 항상 redirect)
                        .defaultSuccessUrl("/", true)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/")
                        .permitAll()
                );

        return http.build();
    }
}