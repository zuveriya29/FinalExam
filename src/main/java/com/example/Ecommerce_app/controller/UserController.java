package com.example.Ecommerce_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Ecommerce_app.entity.Order;
import com.example.Ecommerce_app.service.OrderService;




@Controller
public class UserController {
	@Autowired
    private OrderService orderService;


	
	
	@GetMapping("/index")
    public String index(Model model ) {
		List<Order> allOrders = orderService.getAllOrders();
		model.addAttribute("orders",allOrders);
     
        return "index";
    }
	
}
