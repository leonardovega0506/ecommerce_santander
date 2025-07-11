package com.minsait.ecommerce.domain.purchase.model.entity;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PurchaseDetailModel {

    private Long productId;
    private String name;
    private int quantity;
    private BigDecimal unitPrice;
}
