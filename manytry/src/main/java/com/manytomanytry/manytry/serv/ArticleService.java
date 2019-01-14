package com.manytomanytry.manytry.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytomanytry.manytry.entit.Article;
import com.manytomanytry.manytry.repo.ArticleRepository;


@Service
public class ArticleService {
	
	@Autowired
	ArticleRepository articleRepository;

	public Article saveArticle(Article article) {
		return articleRepository.save(article);
	}

	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return articleRepository.findAll();
	}

	public Article findByNameArticle(String name) {
		// TODO Auto-generated method stub
		return articleRepository.findByNameArticle(name);
	}
}
