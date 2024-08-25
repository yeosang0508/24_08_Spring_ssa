package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ArticleService;
import com.example.demo.vo.Article;


@Controller
public class UserArticleController {
	
	@Autowired
	ArticleService articleService;
	
	
	@RequestMapping("/user/article/detail")
	public String showDetail(Model model, int id) {
		Article article = articleService.getArticleById(id);
		
		model.addAttribute("article", article);
		
		return "/user/article/detail";
		
	}

	
	@RequestMapping("/user/article/list")
	public String showList(Model model) {
		List<Article> articles = articleService.getArticles();
		
		model.addAttribute("articles",articles);
		
		return "/user/article/list";
		
	}
	
}
