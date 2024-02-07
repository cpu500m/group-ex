package study.exec.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
public class Account {
    @Id @GeneratedValue
    @Column(name = "account_id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne()
    @JoinColumn(name = "bank_id")
    private Bank bank;
    private String password;
    private Long money;
    @Embedded
    private AccountLog accountLog;

    /**
     * 계좌주, 계좌 비밀번호
     */
    @Builder
    protected Account(Member member, String password) {
        this.member = member;
        this.password = password;
        this.money = 0L;
    }

    public static Long createAccount(Member member, String password) {
        // 은행은?..
        Account account = Account.builder()
                .member(member)
                .password(password)
                .build();

        // 새로운 내용@!

        return 0l;
    }

    // 대충 출금 로직 작성 완료
}
