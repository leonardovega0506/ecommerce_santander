package com.minsait.ecommerce.infraestructure.product.adapater.jpa.repository;

import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import com.minsait.ecommerce.domain.product.model.exception.ProductNotFoundException;
import com.minsait.ecommerce.domain.product.port.repository.IProductRepository;
import com.minsait.ecommerce.infraestructure.product.adapater.entity.ProductEntity;
import com.minsait.ecommerce.infraestructure.product.adapater.jpa.IProductJPAAdapterRepository;
import com.minsait.ecommerce.infraestructure.product.adapater.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductAdapaterRepository implements IProductRepository {

    private final IProductJPAAdapterRepository productRepository;
    private final ProductMapper mapper;

    @Override
    public ProductModel create(ProductModel body) {
        return mapper.toDomain(productRepository.save(mapper.toEntity(body)));
    }

    @Override
    public ProductModel update(Long id, ProductModel body) {
        ProductEntity productGet = productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Producto no encontrado"));
        productGet.setName(String.valueOf(body.getName()));
        productGet.setPrice(body.getPrice().getPrice());
        productGet.setStock(body.getStock().getStock());

        ProductEntity productUpdated = productRepository.save(productGet);

        return mapper.toDomain(productUpdated);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public boolean existByName(String name) {
        return productRepository.existsByName(name);
    }
}
