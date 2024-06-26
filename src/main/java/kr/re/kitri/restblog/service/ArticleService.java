package kr.re.kitri.restblog.service;

import kr.re.kitri.restblog.model.Article;
import kr.re.kitri.restblog.repository.ArticleRepository;
import kr.re.kitri.restblog.repository.ArticleRepository_old;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    // 실제 기능(설계상의 기능, 요구사항)이 포함된다.
    // 1. 글 전체보기.
    public Iterable<Article> getArticles() {
        return articleRepository.findAll();
    }

    // 2. 글 상세보기 by ID
    public Optional<Article> getArticleById(long id) {
        // 원래는 글데이터를 DB에서 조회 후 데이터를 전송, but 지금은 페이크로 전달
        return articleRepository.findById(id);
    }

    // 3. 글 등록
    public Article registArticle(Article article) {
        return articleRepository.save(article);
    }

    // 4. 글 수정
    public Article modifyArticle(Article article) {
        return articleRepository.save(article);
    }

    // 5. 글 삭제
    public void removeArticle(long articleId) {
        articleRepository.deleteById(articleId);
    }
}
