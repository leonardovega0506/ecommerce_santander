package com.minsait.ecommerce.domain.customer.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {

    private long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
}
