package com.example.Flipkart.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Flipkart.Model.Order;
import com.example.Flipkart.Repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public Order placeOrder(Order order) {
		return orderRepository.save(order);
	}
}
