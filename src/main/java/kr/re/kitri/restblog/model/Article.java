package kr.re.kitri.restblog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Table("article")
public class Article {
    @Id
    private long id;
    private String title;
    private String content;
    private long views;
}
