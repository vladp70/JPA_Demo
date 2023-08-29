package com.example.demoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue
    Integer id;

    Integer order_id;

    String product_code;

    Integer quantity;

    Double priceEach;
}
