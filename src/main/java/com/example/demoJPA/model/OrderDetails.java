package com.example.demoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue
    Integer id;

    Integer orderId;

    String productCode;

    Integer quantity;

    Double priceEach;
}
