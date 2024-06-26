package kr.re.kitri.restblog.repository;

import jakarta.transaction.Transactional;
import kr.re.kitri.restblog.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Modifying
    @Query(value = "UPDATE public.article SET views = views + 1 WHERE id = :id", nativeQuery = true)
    void increaseViewCount(long id);
}
