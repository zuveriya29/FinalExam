package com.example.Ecommerce_app.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name="orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //auto increment id in database
    public String id;

    public String orderId;
    public String customer;
    public  String orderItem;
    public LocalDate deliveryDate;
    public Double deliveryPricing;
    public  String status;

    public Order() {} // no-args constructor

    public Order(String id, String orderId, String customer, String orderItem, LocalDate deliveryDate, Double deliveryPricing, String status) {
        this.id = id;
        this.orderId = orderId;
        this.customer = customer;
        this.orderItem = orderItem;
        this.deliveryDate = deliveryDate;
        this.deliveryPricing = deliveryPricing;
        this.status = status;
    }
}