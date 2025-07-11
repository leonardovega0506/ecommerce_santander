package com.minsait.ecommerce.infraestructure.purchase.adapter.jpa.repository;

import com.minsait.ecommerce.domain.purchase.model.entity.PurchaseModel;
import com.minsait.ecommerce.domain.purchase.port.repository.IPurchaseRepository;

import com.minsait.ecommerce.infraestructure.purchase.adapter.entity.PurchaseEntity;
import com.minsait.ecommerce.infraestructure.purchase.adapter.mapper.PurchaseMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class IPurchaseJPAAdapterRepository implements IPurchaseRepository {

    private final com.minsait.ecommerce.infraestructure.purchase.adapter.jpa.IPurchaseJPAAdapterRepository purchaseRepository;
    private final PurchaseMapper mapper;

    @Override
    public PurchaseModel savePurchase(PurchaseModel body) {
        PurchaseEntity newPurchase = purchaseRepository.save(mapper.toEntity(body));
        return mapper.toDomain(newPurchase);
    }
}
