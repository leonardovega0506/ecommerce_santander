package com.minsait.ecommerce.infraestructure.product.adapater.jpa.dao;

import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import com.minsait.ecommerce.domain.product.model.exception.ProductNotFoundException;
import com.minsait.ecommerce.domain.product.port.dao.IProductDAO;
import com.minsait.ecommerce.infraestructure.product.adapater.jpa.IProductJPAAdapterRepository;
import com.minsait.ecommerce.infraestructure.product.adapater.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class ProductAdapaterDAO implements IProductDAO {

    private final IProductJPAAdapterRepository productRepository;
    private final ProductMapper mapper;

    @Override
    public ProductModel findById(Long id) {
        return mapper.toDomain(productRepository.findById(id).orElseThrow(()->new ProductNotFoundException("Producto no encontrado")));
    }

    @Override
    public List<ProductModel> findAll() {
        return productRepository.findAll().stream().map(mapper::toDomain).collect(Collectors.toList());
    }
}
