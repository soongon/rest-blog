package kr.re.kitri.restblog.repository;

import kr.re.kitri.restblog.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Member, Long> {
    @Modifying
    @Query(value = "update member set  point = point + 3 where id = :id", nativeQuery = true)
    void increaseMemberPoints(long id);
}
