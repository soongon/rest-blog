package kr.re.kitri.restblog.controller;

import kr.re.kitri.restblog.model.Article;
import kr.re.kitri.restblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/api/articles") // 글 전체보기
    public ResponseEntity<List<Article>> allArticles() {
        // 전체글조회 하는 기능을 가진 서비스를 호출
        List<Article> articles = articleService.getArticles();
        return ResponseEntity.ok().body(articles);
    }
    @GetMapping("/api/articles/{articleId}") // 글 상세보기
    public ResponseEntity<Article> detailArticle(@PathVariable long articleId) {
        // 서비스의 getArticleById(long articleId) 함수를 호출하여 구현
        return ResponseEntity.ok().body(articleService.getArticleById(articleId));
    }

    @PostMapping("/api/articles") // 글 등록 .. json 글데이터를 자바 객체(모델)로 변환
    public ResponseEntity<Article> registArticle(@RequestBody Article article) {
        return ResponseEntity.status(HttpStatus.CREATED).body(articleService.registArticle(article));
    }
    @PutMapping("/api/articles") // 글 수정
    public ResponseEntity<Article> modifyArticle(@RequestBody Article article) {
        return ResponseEntity.ok().body(articleService.modifyArticle(article));
    }

    @DeleteMapping("/api/articles/{articleId}") // 글 삭제
    public ResponseEntity<Void> removeArticle(@PathVariable long articleId) {
        articleService.removeArticle(articleId);
        return ResponseEntity.noContent().build();
    }
}
