package io.virandry.maska.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import io.virandry.maska.dao.AbstractDAO;
import io.virandry.maska.dao.ProductDAO;
import io.virandry.maska.model.Product;

@Component
public class ProductDAOImpl extends AbstractDAO implements ProductDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() {
		String hql = "FROM Product prdc ORDER BY prdc.productId";
		return entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Product getProductById(int productId) {
		return entityManager.find(Product.class, productId);
	}

	@Override
	public void addProduct(Product product) {
		entityManager.persist(product);
	}

	@Override
	public void updateProduct(Product product) {
		Product prdc = getProductById(product.getProductId());
		prdc.setProductName(product.getProductName());
		prdc.setProductDesc(product.getProductDesc());
		prdc.setIsActive(product.getIsActive());
		prdc.setModifiedBy(product.getModifiedBy());
		prdc.setModifiedTime(new Date());
		prdc.setPreorderQuantity(product.getPreorderQuantity());
		prdc.setPrice(product.getPrice());
		prdc.setQuantity(product.getQuantity());
		prdc.setSellPrice(product.getSellPrice());
		entityManager.flush();
	}

	@Override
	public void deleteProduct(int productId) {
		entityManager.remove(getProductById(productId));
	}

	@Override
	public boolean productExists(String productName) {
		String hql = "FROM Product as prdc WHERE prdc.productName = ?";
		int count = entityManager.createQuery(hql).setParameter(1, productName).getResultList()
				.size();
		return count > 0 ? true : false;
	}


}
