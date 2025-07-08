package com.minsait.ecommerce.domain.product.service;

import java.util.List;

import com.minsait.ecommerce.domain.product.model.entity.ProductEntity;
import com.minsait.ecommerce.domain.product.port.dao.IProductDAO;
import com.minsait.ecommerce.domain.product.port.repository.IProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductService {

    private final IProductDAO productADO;
    private final IProductRepository productRepository;

    public List<ProductEntity> findAll(){
        return productADO.findAll();
    }

    public ProductEntity findById(long id){
        return productADO.findById(id);
    }

    public ProductEntity save(ProductEntity body){
        return productRepository.create(body);
    }


}
