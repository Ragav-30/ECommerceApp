package com.example.Flipkart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Flipkart.Model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
