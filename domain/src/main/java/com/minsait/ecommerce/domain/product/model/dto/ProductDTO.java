package com.minsait.ecommerce.domain.product.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long id;
    private String name;
    private double price;
    private int stock;
}
