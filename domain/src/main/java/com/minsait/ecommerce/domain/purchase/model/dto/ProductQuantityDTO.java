package com.minsait.ecommerce.domain.purchase.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductQuantityDTO {

    private Long productId;
    private int quantity;
}
