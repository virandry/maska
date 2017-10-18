package io.virandry.maska.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.virandry.maska.dao.ProductDAO;
import io.virandry.maska.model.Product;
import io.virandry.maska.model.ProductFilter;
import io.virandry.maska.service.ProductService;
import io.virandry.maska.util.Util;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO productDAO;

	@Override
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}

	@Override
	public Product getProductById(int productId) {
		return productDAO.getProductById(productId);
	}

	@Override
	@Transactional
	public boolean addProduct(Product product) {
		if (productDAO.productExists(product.getProductName())) {
			return false;
		} else {
			productDAO.addProduct(product);
			return true;
		}
	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		productDAO.updateProduct(product);		
	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		productDAO.deleteProduct(productId);		
	}

	@Override
	public List<Product> getProductsByFilter(List<Product> products, ProductFilter productFilter) {
		if (!Util.isEmpty(productFilter.getCurrencyId())){
			
		}
		return null;
	}

}