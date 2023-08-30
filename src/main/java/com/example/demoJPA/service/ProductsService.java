package com.example.demoJPA.service;

import com.example.demoJPA.model.Orders;
import com.example.demoJPA.model.Products;
import com.example.demoJPA.repository.OrdersRepository;
import com.example.demoJPA.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    ProductsRepository productsRepository;

    @Autowired
    OrdersRepository ordersRepository;

    public void insertProduct(Products p){
        productsRepository.save(p);
    }

    public List<Products> getAll() {
        return productsRepository.findAll();
    }

    public void insertOrder(Orders o) {
        ordersRepository.save(o);
    }
}
