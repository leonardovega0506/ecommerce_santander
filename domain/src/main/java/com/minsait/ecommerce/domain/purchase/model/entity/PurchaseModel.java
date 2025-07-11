package com.minsait.ecommerce.domain.purchase.model.entity;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PurchaseModel {
    private Long id;
    private Long customerId;
    private List<PurchaseDetailModel> products;
    private BigDecimal totalPrice;
    private LocalDateTime createdAt;
}
