package io.virandry.maska.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.virandry.maska.dao.ProductDAO;
import io.virandry.maska.dao.ProductDetailDAO;
import io.virandry.maska.model.Detail;
import io.virandry.maska.model.Product;
import io.virandry.maska.model.ProductFilter;
import io.virandry.maska.model.Subdetail;
import io.virandry.maska.service.ProductService;
import io.virandry.maska.util.Util;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO productDAO;
	@Autowired
	ProductDetailDAO productDetailDAO;

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

		if (!Util.isEmpty(productFilter.getCurrencyId())) {
			products = products.stream()
					.filter(product -> product.getCurrency().getCurrencyId().equals(productFilter.getCurrencyId()))
					.collect(Collectors.toList());
		}
		if (!Util.isEmpty(productFilter.getIsActive())) {
			products = products.stream().filter(product -> product.getIsActive() == productFilter.getIsActive())
					.collect(Collectors.toList());
		}
		if (!Util.isEmpty(productFilter.getSubCategoryId())) {
			products = products.stream().filter(
					product -> product.getSubcategory().getSubCategoryId().equals(productFilter.getSubCategoryId()))
					.collect(Collectors.toList());
		}
		if (!Util.isEmpty(productFilter.getSortBy())) {

		}
		return products;
	}

	@Override
	public List<Detail> getAllDetails() {
		return productDetailDAO.getAllDetails();
	}

	@Override
	public List<Subdetail> getAllSubDetails() {
		return productDetailDAO.getAllSubDetails();
	}

	@Override
	public List<Subdetail> getSubDetailsByProductId(int productId) {
		return productDetailDAO.getSubDetailsByProductId(productId);
	}

}