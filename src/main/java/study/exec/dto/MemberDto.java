package study.exec.dto;


import lombok.Data;
import study.exec.domain.Member;

@Data
public class MemberDto {
    private String name;
    private String password;

    public Member convert2Member(){
        return Member.builder()
                .name(this.name)
                .password(this.password)
                .build();
    }
}
