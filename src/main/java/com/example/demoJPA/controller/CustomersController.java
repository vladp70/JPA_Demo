package com.example.demoJPA.controller;

import com.example.demoJPA.dto.PostalDetailsUserDTO;
import com.example.demoJPA.model.Customers;
import com.example.demoJPA.model.Orders;
import com.example.demoJPA.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomersController {
    @Autowired
    CustomersService customersService;

    @GetMapping("/orders/{id}")
    public List<Orders> GetOrdersByCustomer(@PathVariable Integer id){
        return customersService.getCustomerOrders(id);
    }

    @GetMapping("/postal/{username}")
    public Optional<PostalDetailsUserDTO> GetPostalDetails(@PathVariable String username){
        return customersService.getPostalDetails(username);
    }

    @PostMapping("/insertCustomer")
    public void InsertCustomer(){
        Customers c = new Customers();
        c.setUsername("MihailB14");
        c.setFirstName("Mihail");
        c.setLastName("Barbulescu");
        c.setPhone("0773844123");
        c.setAddress("Bd. Tineretului");
        c.setCity("Bucuresti");
        c.setPostalCode("123456");
        c.setCountry("Romania");
        customersService.CreateCustomer(c);
    }
}
