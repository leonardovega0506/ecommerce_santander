package com.minsait.ecommerce.domain.product.port.dao;

import java.util.List;

import com.minsait.ecommerce.domain.product.model.entity.ProductModel;

public interface IProductDAO {

    ProductModel findById(Long id);
    List<ProductModel> findAll();

}
