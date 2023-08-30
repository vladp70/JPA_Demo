package com.example.demoJPA.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostalDetailsUserDTO {
    String phone;

    String address;

    String city;
}
