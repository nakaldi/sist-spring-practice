package beom.spring_practice.repository;

import beom.spring_practice.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByEmail(String name);
    List<Member> findAll();
}