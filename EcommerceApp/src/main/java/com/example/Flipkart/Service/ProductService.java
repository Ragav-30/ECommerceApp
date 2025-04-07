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

	public List<Product> getAllProducts(double price, int stock) {
		if (price == 0) {
			return productRepository.findAll();
		} else {
			return productRepository.findByPriceAndStock(price, stock);
		}

	}

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	public Product updateProduct(Long id, Product newproduct) {
		return productRepository.findById(id).map(product -> {
			product.setName(newproduct.getName());
			product.setPrice(newproduct.getPrice());
			product.setStock(newproduct.getStock());
			product.setDescription(newproduct.getDescription());
			return productRepository.save(product);
		}).orElseThrow(() -> new RuntimeException("Id not found"));

	}

	public Product findById(Long id) {
		Optional<Product> userOptional = productRepository.findById(id);
		return userOptional.orElse(null);
	}
}
