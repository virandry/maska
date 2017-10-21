package io.virandry.maska.service;

import io.virandry.maska.model.Category;

public interface CategoryService {
	
	public boolean persist(Category transientInstance);

	public void remove(Category persistentInstance);

	public Category merge(Category detachedInstance);

	public Category findById(String id);
}
