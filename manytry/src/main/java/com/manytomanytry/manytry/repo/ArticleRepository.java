package com.manytomanytry.manytry.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomanytry.manytry.entit.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{
	

	Article findByNameArticle (String name);
}
