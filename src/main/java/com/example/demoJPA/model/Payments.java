package com.example.demoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Payments {
    @Id
    @GeneratedValue
    Integer customer_id;

    Date payment_date;

    Double amount;
}
