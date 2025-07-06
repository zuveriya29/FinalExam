package com.example.Ecommerce_app.service;



import com.example.Ecommerce_app.entity.Order;
import com.example.Ecommerce_app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
    	List<Order> allOrders = orderRepository.findAll();
    	System.out.println(allOrders);
    	System.out.println("values lenght --- " +  allOrders .size());
    	return allOrders;
     
    }

    public List<Order> getOrdersByStatus(String status) {
    	
        return orderRepository.findByStatus(status);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}