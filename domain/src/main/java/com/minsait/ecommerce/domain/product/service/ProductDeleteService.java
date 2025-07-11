package com.minsait.ecommerce.domain.product.service;

import com.minsait.ecommerce.domain.product.port.repository.IProductRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductDeleteService {
    private final IProductRepository productRepository;

    public void execute(Long id){
        productRepository.delete(id);
    }
}
