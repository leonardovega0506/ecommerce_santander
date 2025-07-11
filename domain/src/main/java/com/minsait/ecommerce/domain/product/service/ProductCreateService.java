package com.minsait.ecommerce.domain.product.service;

import com.minsait.ecommerce.domain.message.port.IMessageRepository;
import com.minsait.ecommerce.domain.product.model.dto.command.ProductCreateCommand;
import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import com.minsait.ecommerce.domain.product.model.exception.ProductIllegalException;
import com.minsait.ecommerce.domain.product.port.repository.IProductRepository;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class ProductCreateService {

    private final IProductRepository productRepository;
    private final IMessageRepository messageRepository;

    public ProductModel execute(ProductCreateCommand body){
        validateProduct(body);
        ProductModel newProduct = new ProductModel().requestToCreate(body);
        messageRepository.publishMessage("Product created");
        return productRepository.create(newProduct);
    }

    private void validateProduct(ProductCreateCommand body){
        if(body.getName()==null||body.getName().isBlank())
            throw  new ProductIllegalException("El nombre del producto no esta definido");
        if(body.getPrice()==null||body.getPrice().compareTo(BigDecimal.ZERO)<=0)
            throw  new ProductIllegalException("El precio no esta definido o es menor que cero");
        if(body.getStock()<=0)
            throw  new ProductIllegalException("La cantidad del producto es cero o menor a cero");
        if(productRepository.existByName(body.getName()))
            throw  new ProductIllegalException("El nombre del producto ya esta registrado");
    }
}
