package com.example.Flipkart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Flipkart.Model.Order;
import com.example.Flipkart.Service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;

	@PostMapping("/placeOrder")
	public Order placeOrder(@RequestBody Order order) {
		return orderService.placeOrder(order);
	}
}
