package com.example.demoJPA.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    Date orderDate;

    Date shippedDate;

    String status;

    String comments;

    Integer customerId;

}
