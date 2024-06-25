package kr.re.kitri.restblog.controller;

import kr.re.kitri.restblog.model.Article;
import kr.re.kitri.restblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/api/articles") // 글 전체보기
    public List<Article> allArticles() {
        // 전체글조회 하는 기능을 가진 서비스를 호출
        return articleService.getArticles();
    }
    @GetMapping("/api/articles/{articleId}") // 글 상세보기
    public Article detailArticle(@PathVariable long articleId) {
        return new Article(articleId, "상세보기 조회 테스트", "테스트에요", 0);
    }

    // @PostMapping("/api/articles") // 글 등록

    // @PutMapping("/api/articles") // 글 수정

    // @DeleteMapping("/api/articles/{articleId}") // 글 삭제
}
