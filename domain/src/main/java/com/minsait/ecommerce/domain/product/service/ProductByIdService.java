package com.minsait.ecommerce.domain.product.service;

import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import com.minsait.ecommerce.domain.product.port.dao.IProductDAO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductByIdService {

    private final IProductDAO productDAO;

    public ProductModel execute(Long id){
        return productDAO.findById(id);
    }
}
