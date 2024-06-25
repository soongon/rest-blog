package kr.re.kitri.restblog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {
    private long id;
    private String title;
    private String content;
    private long views;
}
