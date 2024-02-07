package study.exec.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter

public class Bank {
    @Id
    @GeneratedValue

    @Column(name = "bank_id")
    private Long id;
    private String name;

    // 회원 멤버 수
    private Long memberCount;

    @Builder
    protected Bank(String name, Long memberCount){
        this.name = name;
        this.memberCount = memberCount;
    }
}
