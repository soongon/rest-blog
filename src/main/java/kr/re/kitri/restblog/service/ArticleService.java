package kr.re.kitri.restblog.service;

import kr.re.kitri.restblog.model.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    // 실제 기능(설계상의 기능, 요구사항)이 포함된다.
    // 1. 글 전체보기.
    public List<Article> getArticles() {
        // 글데이터를 직접 만들어서 보내준다. (실제로는 DB연동해서 가져와야 함)
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1, "첫글", "첨 써봐요", 0));
        articles.add(new Article(2, "두번째 글", "두번째 써봐요", 45));
        articles.add(new Article(3, "세번째글", "세번째 써봐요", 78766));
        articles.add(new Article(4, "네번째글", "네번째 써봐요", 3254325));

        return articles;
    }
}
