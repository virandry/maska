package io.virandry.maska.dao;

import java.util.List;
import io.virandry.maska.model.Article;

public interface ArticleDAO {
	List<Article> getAllArticles();

	Article getArticleById(int articleId);

	void addArticle(Article article);

	void updateArticle(Article article);

	void deleteArticle(int articleId);

	boolean articleExists(String title, String category);
}