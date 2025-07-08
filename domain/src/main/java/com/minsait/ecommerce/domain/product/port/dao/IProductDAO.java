package com.minsait.ecommerce.domain.product.port.dao;

import java.util.List;

import com.minsait.ecommerce.domain.product.model.entity.ProductEntity;

public interface IProductDAO {

    ProductEntity findById(Long id);
    List<ProductEntity> findAll();

}
