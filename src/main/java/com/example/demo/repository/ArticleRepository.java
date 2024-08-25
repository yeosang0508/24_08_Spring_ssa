package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.Article;

@Mapper
public interface ArticleRepository {

	@Select("""
			SELECT *
			FROM article
			ORDER BY id DESC;
			""")
	public  List<Article> getArticles();

	
	@Select("""
			SELECT *
			FROM article
			WHERE id = ${id}
			""")
	public Article getArticleById(int id); 

}
