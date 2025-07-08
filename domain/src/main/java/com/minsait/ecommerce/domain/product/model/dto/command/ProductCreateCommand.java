package com.minsait.ecommerce.domain.product.model.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class ProductCreateCommand {

    private String name;
    private double price;
    private int stock;

}
