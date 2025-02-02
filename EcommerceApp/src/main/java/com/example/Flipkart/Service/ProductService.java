package com.example.Flipkart.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Flipkart.Model.Product;
import com.example.Flipkart.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public ProductService() {
		System.out.println("ProductService instantiated!");
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	public Product findById(Long id) {
		Optional<Product> userOptional = productRepository.findById(id);
		return userOptional.orElse(null);
	}
}
