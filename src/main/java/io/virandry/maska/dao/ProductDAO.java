package io.virandry.maska.dao;

import java.util.List;
import io.virandry.maska.model.Product;

public interface ProductDAO {
	List<Product> getAllProducts();

	Product getProductById(int productId);

	void addProduct(Product product);

	void updateProduct(Product product);

	void deleteProduct(int productId);

	boolean productExists(String productName);
}