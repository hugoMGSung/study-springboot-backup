package com.hugo83.sblog04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hugo83.sblog04.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}