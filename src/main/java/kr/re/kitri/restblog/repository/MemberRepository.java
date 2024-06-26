package kr.re.kitri.restblog.repository;

import kr.re.kitri.restblog.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
