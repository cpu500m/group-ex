package study.exec.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.exec.domain.Account;

@Repository
@RequiredArgsConstructor
public class AccountRepository {
    private final EntityManager em;
    public Long save(Account account) {
        em.persist(account);
        return account.getId();
    }
}
