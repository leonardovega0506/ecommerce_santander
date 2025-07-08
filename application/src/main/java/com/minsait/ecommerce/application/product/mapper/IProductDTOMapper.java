package com.minsait.ecommerce.application.product.mapper;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

@Component
@Mapper(componentModel = "spring")
public class IProductDTOMapper {

    @Mapping(source = "id",target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source ="price",target = "price")
     @Mapping(source ="stock",target = "stock")
    ProductoDTO toDto(ProductoEntity domain);
}
