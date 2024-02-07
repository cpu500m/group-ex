package study.exec.dto;

import lombok.Data;
import study.exec.domain.Account;

@Data
public class AccountDto {
    private String password;

    public Account convert2Account(){
        return Account.builder()
                .password(this.password)
                .build();
    }
}
