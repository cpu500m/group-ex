package study.exec.dto;

import lombok.Data;
import study.exec.domain.Bank;

@Data
public class BankDto {
    private String name;

    public Bank convert2Bank(){
        return Bank.builder()
                .name(this.name)
                .build();
    }

}
