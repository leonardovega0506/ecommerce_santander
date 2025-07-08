package com.minsait.ecommerce.domain.product.model.entity;

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
public class ProductEntity {

    private long id;
    private String name;
    private double price;
    private int stock;

}
