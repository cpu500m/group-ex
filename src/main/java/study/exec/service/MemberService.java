package study.exec.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.exec.domain.Member;
import study.exec.dto.BankDto;
import study.exec.dto.MemberDto;
import study.exec.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Long saveMember(MemberDto memberDto){
        Member member = memberDto.convert2Member();
        return memberRepository.save(member);
    }


}
