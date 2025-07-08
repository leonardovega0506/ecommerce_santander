package com.minsait.ecommerce.domain.product.port.repository;

import com.minsait.ecommerce.domain.product.model.entity.ProductEntity;

public interface IProductRepository {
    ProductEntity create(ProductEntity customer);
}
