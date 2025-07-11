package com.minsait.ecommerce.infraestructure.purchase.adapter.jpa.dao;

import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import com.minsait.ecommerce.domain.product.model.exception.ProductNotFoundException;
import com.minsait.ecommerce.domain.purchase.port.dao.IDataProductsDAO;

import com.minsait.ecommerce.infraestructure.product.adapater.jpa.IProductJPAAdapterRepository;
import com.minsait.ecommerce.infraestructure.product.adapater.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DataProductsAdapater implements IDataProductsDAO {

    private final IProductJPAAdapterRepository productRepository;
    private final ProductMapper mapper;

    @Override
    public ProductModel getData(Long id) {
        return mapper.toDomain(productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("Producto no encontrado")));
    }
}
