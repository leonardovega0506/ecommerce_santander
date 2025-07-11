package com.minsait.ecommerce.infraestructure.product.adapater.mapper;


import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import com.minsait.ecommerce.infraestructure.product.adapater.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductModel toDomain(ProductEntity entity){
        if(entity == null)
            return null;
        return new ProductModel(entity.getId(),entity.getName(),entity.getPrice(),entity.getStock());
    }

    public ProductEntity toEntity(ProductModel model){
        if(model==null)
            return null;
        ProductEntity entity = new ProductEntity();
        entity.setId(model.getId().getId());
        entity.setName(model.getName().getName());
        entity.setPrice(model.getPrice().getPrice());
        entity.setStock(model.getStock().getStock());

        return entity;
    }
}
