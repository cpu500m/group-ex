package study.exec.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.exec.domain.Bank;
import study.exec.dto.BankDto;
import study.exec.repository.BankRepository;

@Service
@RequiredArgsConstructor
public class BankService {
    private final BankRepository bankRepository;

    public Long registerBank(BankDto bankDto) {
        Bank bank = bankDto.convert2Bank();
        bankRepository.save(bank);
        return bank.getId();
    }
}
