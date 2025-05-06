package beom.spring_practice.config;

import beom.spring_practice.repository.JpaMemberRepository;
import beom.spring_practice.repository.MemberRepository;
import beom.spring_practice.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;
    private final EntityManager em;
    private final PasswordEncoder passwordEncoder;

    public SpringConfig(DataSource dataSource, EntityManager em, PasswordEncoder passwordEncoder) {
        this.dataSource = dataSource;
        this.em = em;
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository(), passwordEncoder);
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }
}
