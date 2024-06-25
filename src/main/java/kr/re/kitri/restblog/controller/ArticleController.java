package kr.re.kitri.restblog.controller;

import kr.re.kitri.restblog.model.Article;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticleController {
    @GetMapping("/api/articles") // 글 전체보기
    public List<Article> allArticles() {
        // 글데이터를 직접 만들어서 보내준다. (실제로는 DB연동해서 가져와야 함)
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1, "첫글", "첨 써봐요", 0));
        articles.add(new Article(2, "두번째 글", "두번째 써봐요", 45));
        articles.add(new Article(3, "세번째글", "세번째 써봐요", 78766));
        articles.add(new Article(4, "네번째글", "네번째 써봐요", 3254325));

        return articles;
    }
    @GetMapping("/api/articles/{articleId}") // 글 상세보기
    public Article detailArticle(@PathVariable long articleId) {
        return new Article(articleId, "상세보기 조회 테스트", "테스트에요", 0);
    }

    // @PostMapping("/api/articles") // 글 등록

    // @PutMapping("/api/articles") // 글 수정

    // @DeleteMapping("/api/articles/{articleId}") // 글 삭제
}
