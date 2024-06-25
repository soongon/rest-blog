package kr.re.kitri.restblog.service;

import kr.re.kitri.restblog.model.Article;
import kr.re.kitri.restblog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    // 실제 기능(설계상의 기능, 요구사항)이 포함된다.
    // 1. 글 전체보기.
    public List<Article> getArticles() {
        return articleRepository.selectAllArticles();
    }

    // 2. 글 상세보기 by ID
    public Article getArticleById(long id) {
        // 원래는 글데이터를 DB에서 조회 후 데이터를 전송, but 지금은 페이크로 전달
        return articleRepository.selectArticleById(id);
    }
}