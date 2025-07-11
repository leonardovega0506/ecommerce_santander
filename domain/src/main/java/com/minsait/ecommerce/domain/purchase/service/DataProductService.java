package com.minsait.ecommerce.domain.purchase.service;

import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import com.minsait.ecommerce.domain.purchase.port.dao.IDataProductsDAO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DataProductService {

    private final IDataProductsDAO productsDAO;

    public ProductModel execute(Long id){
        return productsDAO.getData(id);
    }
}
