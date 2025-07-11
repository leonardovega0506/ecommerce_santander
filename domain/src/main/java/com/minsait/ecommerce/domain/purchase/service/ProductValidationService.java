package com.minsait.ecommerce.domain.purchase.service;

import com.minsait.ecommerce.domain.purchase.port.dao.IProductValidationDAO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductValidationService {
    private final IProductValidationDAO productValidationDAO;

    public boolean execute(Long id){
        return productValidationDAO.existProduct(id);
    }
}
