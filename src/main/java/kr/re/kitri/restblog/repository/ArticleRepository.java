package kr.re.kitri.restblog.repository;

import kr.re.kitri.restblog.model.Article;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

    @Query("UPDATE public.article SET views = views + 1 WHERE id = :id")
    void increaseViewCount(long id);
}
