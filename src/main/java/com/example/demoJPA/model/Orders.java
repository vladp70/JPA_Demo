package com.example.demoJPA.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "order_products",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "code"))
    Set<Products> orderedProducts = new HashSet<>();

    Date orderDate;

    Date shippedDate;

    String status;

    String comments;

    Integer customerId;

    public void addProduct (Products p) {
        orderedProducts.add(p);
    }
}
