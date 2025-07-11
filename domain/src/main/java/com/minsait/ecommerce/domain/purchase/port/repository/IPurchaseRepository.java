package com.minsait.ecommerce.domain.purchase.port.repository;

import com.minsait.ecommerce.domain.purchase.model.entity.PurchaseModel;

public interface IPurchaseRepository {

    PurchaseModel savePurchase(PurchaseModel body);
}
