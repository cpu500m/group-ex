package study.exec.domain;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Embeddable
@Getter
public class AccountLog {
    private LocalDateTime time;
    private String name;
    private Long amount;

    @Builder
    private AccountLog(LocalDateTime time, String name, Long amount) {
        this.time = time;
        this.name = name;
        this.amount = amount;
    }

}
