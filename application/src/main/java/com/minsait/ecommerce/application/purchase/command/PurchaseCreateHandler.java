package com.minsait.ecommerce.application.purchase.command;

import com.minsait.ecommerce.application.purchase.mapper.IPurchaseDTOMapper;
import com.minsait.ecommerce.domain.purchase.model.dto.PurchaseDTO;
import com.minsait.ecommerce.domain.purchase.model.dto.command.PurchaseCreateCommand;
import com.minsait.ecommerce.domain.purchase.service.PurchaseCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PurchaseCreateHandler {

    private final PurchaseCreateService purchaseCreateService;
    private final IPurchaseDTOMapper purchaseDTOMapper;

    public PurchaseDTO execute(PurchaseCreateCommand body){
        return purchaseDTOMapper.toDTO(purchaseCreateService.execute(body));
    }
}
