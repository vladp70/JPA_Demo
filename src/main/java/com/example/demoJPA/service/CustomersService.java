package com.example.demoJPA.service;

import com.example.demoJPA.model.Customers;
import com.example.demoJPA.model.Orders;
import com.example.demoJPA.repository.CustomersRepository;
import com.example.demoJPA.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersService {
    @Autowired
    CustomersRepository customersRepository;

    @Autowired
    OrdersRepository ordersRepository;

    public void CreateCustomer(Customers c){
        customersRepository.save(c);
    }

    public List<Orders> getCustomerOrders(Integer id) {
        return ordersRepository.findByCustomerId(id);
    }
}
