package com.example.Flipkart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Flipkart.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
