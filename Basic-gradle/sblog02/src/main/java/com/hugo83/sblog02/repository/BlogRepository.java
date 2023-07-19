package com.hugo83.sblog02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hugo83.sblog02.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}