package com.hugo83.sblog04.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateArticleRequest {
    private String title;
    private String content;
}
