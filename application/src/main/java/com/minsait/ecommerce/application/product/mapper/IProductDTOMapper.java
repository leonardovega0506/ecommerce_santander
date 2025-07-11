package com.minsait.ecommerce.application.product.mapper;

import com.minsait.ecommerce.domain.product.model.dto.ProductDTO;
import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;


@Component
@Mapper(componentModel = "spring")
public interface IProductDTOMapper {

    @Mapping(source = "id",target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source ="price",target = "price")
    @Mapping(source ="stock",target = "stock")
    ProductDTO toDTO(ProductModel model);
}
