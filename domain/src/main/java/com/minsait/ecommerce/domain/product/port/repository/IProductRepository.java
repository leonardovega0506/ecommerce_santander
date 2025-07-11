package com.minsait.ecommerce.domain.product.port.repository;

import com.minsait.ecommerce.domain.product.model.entity.ProductModel;

public interface IProductRepository {
    ProductModel create(ProductModel productModel);
    ProductModel update(Long id,ProductModel productModel);
    void delete(Long id);
    boolean existByName(String name);
}
