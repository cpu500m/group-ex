package study.exec.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.exec.domain.Bank;

@Repository
@RequiredArgsConstructor
public class BankRepository {
    private final EntityManager em;
    public Long save(Bank bank) {
        em.persist(bank);
        return bank.getId();
    }
}
