package io.virandry.maska.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.virandry.maska.dao.CategoryDAO;
import io.virandry.maska.model.Category;
import io.virandry.maska.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDAO categoryDAO;

	@Override
	public boolean persist(Category transientInstance) {
		if (categoryDAO.categoryExists(transientInstance.getCategoryName())) {
			return false;
		}
		categoryDAO.persist(transientInstance);
		return true;
	}

	@Override
	public void remove(Category persistentInstance) {
		categoryDAO.remove(persistentInstance);
	}

	@Override
	public Category merge(Category detachedInstance) {
		return categoryDAO.merge(detachedInstance);
	}

	@Override
	public Category findById(String id) {
		return categoryDAO.findById(id);
	}

}
