package com.example.Ecommerce_app;
import java.util.Date;
import java.time.LocalDate;
import java.text.SimpleDateFormat;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Ecommerce_app.entity.Order;
import com.example.Ecommerce_app.repository.OrderRepository;
@SpringBootApplication
public class EcommerceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAppApplication.class, args);
	}
	
	
}
