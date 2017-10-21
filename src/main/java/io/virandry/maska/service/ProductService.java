package io.virandry.maska.service;

import java.util.List;

import io.virandry.maska.model.Detail;
import io.virandry.maska.model.Product;
import io.virandry.maska.model.ProductFilter;
import io.virandry.maska.model.Subdetail;

public interface ProductService {
	List<Product> getAllProducts();

	List<Product> getProductsByFilter(List<Product> products, ProductFilter productFilter);

	Product getProductById(int productId);

	boolean addProduct(Product product);

	void updateProduct(Product product);

	void deleteProduct(int productId);
	
	List<Detail> getAllDetails();

	List<Subdetail> getAllSubDetails();

	List<Subdetail> getSubDetailsByProductId(int productId);
}