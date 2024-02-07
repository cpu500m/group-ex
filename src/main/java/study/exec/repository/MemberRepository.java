package study.exec.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.exec.domain.Member;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    private final EntityManager em;
    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }
}
