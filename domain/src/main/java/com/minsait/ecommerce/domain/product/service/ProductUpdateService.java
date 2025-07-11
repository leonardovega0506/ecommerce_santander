package com.minsait.ecommerce.domain.product.service;

import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import com.minsait.ecommerce.domain.product.port.repository.IProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductUpdateService {
    private final IProductRepository productRepository;

    public ProductModel execute(Long id,ProductModel body){
        return productRepository.update(id,body);
    }
}
