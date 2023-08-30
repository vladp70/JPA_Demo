package com.example.demoJPA.controller;

import com.example.demoJPA.model.Orders;
import com.example.demoJPA.model.Products;
import com.example.demoJPA.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @GetMapping(value = "/products")
    public List<Products> GetProducts(){
        return productsService.getAll();
    }

    @PostMapping(value = "/insertProducts")
    public void InsertProducts(){
        Orders o = new Orders();
        o.setComments("Prima comanda!");
        o.setStatus("Confirmed");
        o.setCustomerId(1);

        Products p = new Products();
        p.setName("Coca-Cola");
        p.setStock(100);
        p.setDescription("Un suc foarte foarte bun!");
        p.setPrice(7.99);
        productsService.insertProduct(p);

        o.addProduct(p);

        p = new Products();
        p.setName("Coca-Cola Zero");
        p.setStock(93);
        p.setDescription("Un suc foarte foarte bun fara zahar!");
        p.setPrice(7.89);
        productsService.insertProduct(p);

        o.addProduct(p);

        p = new Products();
        p.setName("Mar");
        p.setStock(200);
        p.setDescription("Fruct gustos!");
        p.setPrice(3.29);
        productsService.insertProduct(p);

        o.addProduct(p);

        p = new Products();
        p.setName("Milka");
        p.setStock(200);
        p.setDescription("Ciocolata premium!");
        p.setPrice(14.99);
        productsService.insertProduct(p);

        o.addProduct(p);

        p = new Products();
        p.setName("Avocado");
        p.setStock(124);
        p.setDescription("Un fruct subapreciat!");
        p.setPrice(12.99);
        productsService.insertProduct(p);

        o.addProduct(p);

        p = new Products();
        p.setName("Paula");
        p.setStock(230);
        p.setDescription("Budinca delicioasa!");
        p.setPrice(6.99);
        productsService.insertProduct(p);

        p = new Products();
        p.setName("Ceai");
        p.setStock(99);
        p.setDescription("Ceai negru!");
        p.setPrice(16.99);
        productsService.insertProduct(p);

        p = new Products();
        p.setName("Cascaval");
        p.setStock(40);
        p.setDescription("Bun de topit!");
        p.setPrice(10.99);
        productsService.insertProduct(p);

        p = new Products();
        p.setName("Guma de mestecat");
        p.setStock(63);
        p.setDescription("Aroma de pepene!");
        p.setPrice(5.99);
        productsService.insertProduct(p);

        p = new Products();
        p.setName("Chipsuri");
        p.setStock(121);
        p.setDescription("Aroma de ceapa verde!");
        p.setPrice(7.49);
        productsService.insertProduct(p);

        productsService.insertOrder(o);
    }

}
