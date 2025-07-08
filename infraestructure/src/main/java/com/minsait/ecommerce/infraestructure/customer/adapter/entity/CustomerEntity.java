package com.minsait.ecommerce.infraestructure.customer.adapter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class CustomerEntity {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
}
