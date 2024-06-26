package kr.re.kitri.restblog.repository;

import kr.re.kitri.restblog.model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
