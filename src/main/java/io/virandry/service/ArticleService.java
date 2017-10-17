package io.virandry.service;

import java.util.List;
import io.virandry.maska.model.Article;

public interface ArticleService {
	List<Article> getAllArticles();

	Article getArticleById(int articleId);

	boolean addArticle(Article article);

	void updateArticle(Article article);

	void deleteArticle(int articleId);
}