package com.hugo83.sblog04.dto;

import java.time.LocalDateTime;

import com.hugo83.sblog04.domain.Article;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {

  private Long id;
  private String title;
  private String content;
  private LocalDateTime createdAt;

  public ArticleViewResponse(Article article) {
    this.id = article.getId();
    this.title = article.getTitle();
    this.content = article.getContent();
    this.createdAt = article.getCreatedAt();
  }
}