package com.minsait.ecommerce.domain.product.service;

import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import com.minsait.ecommerce.domain.product.port.dao.IProductDAO;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductAllService {

    private final IProductDAO productDAO;

    public List<ProductModel> execute(){
        return productDAO.findAll();
    }
}
