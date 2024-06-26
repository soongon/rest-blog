package kr.re.kitri.restblog.controller;

import kr.re.kitri.restblog.model.Member;
import kr.re.kitri.restblog.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    // GET /api/members - 모든 멤버 조회
    @GetMapping("/api/members")
    public ResponseEntity<List<Member>> getAllMembers() {
        List<Member> members = memberService.getAllMembers();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }

    // POST /api/members - 새로운 멤버 추가
    @PostMapping("/api/members")
    public ResponseEntity<Member> addMember(@RequestBody Member newMember) {
        Member createdMember = memberService.addMember(newMember);
        return new ResponseEntity<>(createdMember, HttpStatus.CREATED);
    }

    // GET /api/members/{memberId} - 특정 멤버 조회
    @GetMapping("/api/members/{memberId}")
    public ResponseEntity<Member> getMemberById(@PathVariable Long memberId) {
        Member member = memberService.getMemberById(memberId);
        if (member != null) {
            return new ResponseEntity<>(member, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // PUT /api/members - 기존 멤버 업데이트
    @PutMapping("/api/members")
    public ResponseEntity<Member> updateMember(@RequestBody Member updatedMember) {
        Member member = memberService.updateMember(updatedMember);
        if (member != null) {
            return new ResponseEntity<>(member, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // DELETE /api/members/{memberId} - 특정 멤버 삭제
    @DeleteMapping("/api/members/{memberId}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long memberId) {
        boolean isDeleted = memberService.deleteMember(memberId);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
