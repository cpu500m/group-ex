package study.exec.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.exec.domain.Account;
import study.exec.dto.AccountDto;
import study.exec.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    public Long createAccount(AccountDto accountDto) {
        Account account = accountDto.convert2Account();
        accountRepository.save(account);
        return account.getId();
    }
}
