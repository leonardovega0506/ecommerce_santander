package com.minsait.ecommerce.domain.product.service;

import com.minsait.ecommerce.domain.product.port.repository.IProductRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductExistByNameService {

    private final IProductRepository productRepository;

    public boolean execute(String name){
        return productRepository.existByName(name);
    }
}
