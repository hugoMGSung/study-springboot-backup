package com.hugo83.sblog02.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateArticleRequest {
    private String title;
    private String content;
}
