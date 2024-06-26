package kr.re.kitri.restblog.service;

import kr.re.kitri.restblog.model.Member;
import kr.re.kitri.restblog.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return null;
    }

    public Member addMember(Member newMember) {
        return memberRepository.save(newMember);

    }

    public Member getMemberById(Long memberId) {
        return null;
    }

    public Member updateMember(Member updatedMember) {
        return null;
    }

    public boolean deleteMember(Long memberId) {
        return false;
    }
}
