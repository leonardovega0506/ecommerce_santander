package com.minsait.ecommerce.domain.product.model.entity;

import com.minsait.ecommerce.domain.product.model.dto.command.ProductCreateCommand;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {

    private ProductEntityId id;
    private ProductEntityName name;
    private ProductEntityPrice price;
    private ProductEntityStock stock;

    public ProductModel(Long id, String name, BigDecimal price, int stock) {
        this.id = new ProductEntityId(id);
        this.name = new ProductEntityName(name);
        this.price = new ProductEntityPrice(price);
        this.stock = new ProductEntityStock(stock);
    }

    public ProductModel requestToCreate(ProductCreateCommand body){
        this.name = new ProductEntityName(body.getName());
        this.price = new ProductEntityPrice(body.getPrice());
        this.stock = new ProductEntityStock(body.getStock());
        return this;
    }

}
