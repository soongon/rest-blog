package kr.re.kitri.restblog.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleController {
    @GetMapping("/api/articles") // 글 전체보기
    public String allArticles() {
        return "all articles";
    }

    @GetMapping("/api/articles/{articleId}") // 글 상세보기
    public String detailArticle(@PathVariable String articleId) {
        return "detail article " + articleId;
    }

    // @PostMapping("/api/articles") // 글 등록

    // @PutMapping("/api/articles") // 글 수정

    // @DeleteMapping("/api/articles/{articleId}") // 글 삭제
}
