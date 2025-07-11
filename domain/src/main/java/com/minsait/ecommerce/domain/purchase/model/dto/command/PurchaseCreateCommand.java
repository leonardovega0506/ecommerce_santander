package com.minsait.ecommerce.domain.purchase.model.dto.command;

import com.minsait.ecommerce.domain.purchase.model.dto.ProductQuantityDTO;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PurchaseCreateCommand {

    private Long customerId;
    private List<ProductQuantityDTO> products;
}
