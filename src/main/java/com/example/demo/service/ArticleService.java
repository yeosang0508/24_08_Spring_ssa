package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ArticleRepository;
import com.example.demo.vo.Article;



@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}
	
	public List<Article> getArticles() {
		
		
		return articleRepository.getArticles();
	}

	public Article getArticleById(int id) {
		
		return articleRepository.getArticleById(id);
	}

}
