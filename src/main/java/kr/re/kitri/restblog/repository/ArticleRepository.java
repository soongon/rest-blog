package kr.re.kitri.restblog.repository;

import kr.re.kitri.restblog.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepository {

    // select all articles
    public List<Article> selectAllArticles() {
        // 글데이터를 직접 만들어서 보내준다. (실제로는 DB연동해서 가져와야 함)
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(10, "첫글", "첨 써봐요", 0));
        articles.add(new Article(20, "두번째 글", "두번째 써봐요", 45));
        articles.add(new Article(30, "세번째글", "세번째 써봐요", 78766));
        articles.add(new Article(40, "네번째글", "네번째 써봐요", 3254325));
        return articles;
    }

    // select article by id
    public Article selectArticleById(long id) {
        return new Article(id, "가짜", "레플", 15);
    }

    public Article insertArticle(Article article) {
        System.out.println("정상적으로 인서트 되었습니다.");
        return article;
    }

    // insert article

    // update article

    // delete article
}
