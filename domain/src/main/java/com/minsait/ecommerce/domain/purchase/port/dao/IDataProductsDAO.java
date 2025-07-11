package com.minsait.ecommerce.domain.purchase.port.dao;

import com.minsait.ecommerce.domain.product.model.entity.ProductModel;

public interface IDataProductsDAO {

    ProductModel getData(Long id);
}
