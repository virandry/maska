package io.virandry.maska.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.virandry.maska.dao.ArticleDAO;
import io.virandry.maska.model.Article;
import io.virandry.maska.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDAO articleDAO;

	@Override
	public Article getArticleById(int articleId) {
		Article obj = articleDAO.getArticleById(articleId);
		return obj;
	}

	@Override
	public List<Article> getAllArticles() {
		return articleDAO.getAllArticles();
	}

	@Override
	@Transactional
	public synchronized boolean addArticle(Article article) {
		if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
			return false;
		} else {
			articleDAO.addArticle(article);
			return true;
		}
	}

	@Override
	@Transactional
	public void updateArticle(Article article) {
		articleDAO.updateArticle(article);
	}

	@Override
	@Transactional
	public void deleteArticle(int articleId) {
		articleDAO.deleteArticle(articleId);
	}
}