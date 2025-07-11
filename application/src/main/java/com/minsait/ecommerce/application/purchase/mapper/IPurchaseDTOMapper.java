package com.minsait.ecommerce.application.purchase.mapper;

import com.minsait.ecommerce.domain.purchase.model.dto.PurchaseDTO;
import com.minsait.ecommerce.domain.purchase.model.entity.PurchaseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IPurchaseDTOMapper {

    @Mapping(target = "id",source = "id")
    @Mapping(target = "customerId", source = "customerId")
    @Mapping(target = "products", source = "products")
    @Mapping(target = "totalPrice",source = "totalPrice")
    @Mapping(target = "createdAt",source = "createdAt")
    PurchaseDTO toDTO(PurchaseModel entity);
}
