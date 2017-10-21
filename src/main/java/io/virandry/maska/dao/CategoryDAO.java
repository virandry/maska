package io.virandry.maska.dao;

import io.virandry.maska.model.Category;

public interface CategoryDAO {
	public void persist(Category transientInstance);
	public void remove(Category persistentInstance);
	public Category merge(Category detachedInstance);
	public Category findById(String id);
	public boolean categoryExists(String catName);
}
