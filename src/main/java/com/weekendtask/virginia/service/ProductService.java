package com.weekendtask.virginia.service;

import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.weekendtask.virginia.entity.Product;

public interface ProductService {
	
	public Iterable<Product> getAllProducts();
	
	public Optional<Product> getProductById(int productId);
	
	public Product addProduct(String productForm, MultipartFile productImage) throws JsonMappingException, JsonProcessingException;
	
	public Product updateProduct(String productForm, MultipartFile productImage, int productId) throws JsonMappingException, JsonProcessingException;

	public void deleteProduct(int productId);
}
