package io.virandry.maska.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.virandry.maska.model.Product;
import io.virandry.maska.model.ProductFilter;
import io.virandry.maska.model.Subdetail;
import io.virandry.maska.service.ProductService;

@RestController
@Scope("request")
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	private ProductService productService;
	
	@GetMapping("products")
	public ResponseEntity<List<Product>> getAllProduct() {
		List<Product> list = productService.getAllProducts();
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}
	
	@PostMapping("products/filter")
	public ResponseEntity<List<Product>> getProductsByFilter(@RequestBody ProductFilter productFilter) {
		List<Product> list = productService.getAllProducts();
		List<Product> listFiltered = productService.getProductsByFilter(list, productFilter); 
		
		logger.info(productFilter.getCurrencyId() + "\r\n\r\n");
		logger.info(productFilter.getIsActive() + "\r\n\r\n");
		logger.info(productFilter.getSortBy() + "\r\n\r\n");
		logger.info(productFilter.getSubCategoryId() + "\r\n\r\n");
		return new ResponseEntity<List<Product>>(listFiltered, HttpStatus.OK);
	}
	
	@GetMapping("product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id) {
		Product product = productService.getProductById(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@GetMapping("product/{id}/details")
	public ResponseEntity<List<Subdetail>> getSubDetailsById(@PathVariable("id") Integer id) {
		List<Subdetail> subdetails = productService.getSubDetailsByProductId(id);
		return new ResponseEntity<List<Subdetail>>(subdetails, HttpStatus.OK);
	}
}
