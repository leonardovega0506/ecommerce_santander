package com.minsait.ecommerce.domain.product.model.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class ProductCreateCommand {

    private String name;
    private BigDecimal price;
    private int stock;

}
