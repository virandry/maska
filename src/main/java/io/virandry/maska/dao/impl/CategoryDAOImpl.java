package io.virandry.maska.dao.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import io.virandry.maska.dao.AbstractDAO;
import io.virandry.maska.dao.CategoryDAO;
import io.virandry.maska.model.Category;

@Component
public class CategoryDAOImpl extends AbstractDAO implements CategoryDAO{

	private static final Log log = LogFactory.getLog(CategoryDAOImpl.class);

	@Override
	public void persist(Category transientInstance) {
		entityManager.persist(transientInstance);
	}

	@Override
	public void remove(Category persistentInstance) {
		entityManager.remove(persistentInstance);
	}

	@Override
	public Category merge(Category detachedInstance) {
		return entityManager.merge(detachedInstance);
	}

	@Override
	public Category findById(String id) {
		return entityManager.find(Category.class, id);
	}
	
	@Override
	public boolean categoryExists(String catName) {
		//TODO
		return true;
	}
}
