package com.example.Flipkart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Flipkart.Model.Product;
import com.example.Flipkart.Service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/getProducts")
	public List<Product> getAllProducts(@RequestParam(value = "price", required = false) Double price,
			@RequestParam(value = "stock", required = false) Integer stock) {

		return productService.getAllProducts(price, stock);

	}

	@PostMapping("/addProducts")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@GetMapping("/{id}")
	public Product getUserById(@PathVariable Long id) {
		return productService.findById(id);
	}

	@PutMapping("/{id}")
	public Product updateUserById(@PathVariable Long id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}
}
