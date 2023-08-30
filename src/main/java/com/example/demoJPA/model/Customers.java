package com.example.demoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Customers {

    @Id
    @GeneratedValue
    Integer id;

    String username;

    String lastName;

    String firstName;

    String phone;

    String address;

    String city;

    String postalCode;

    String country;
}

