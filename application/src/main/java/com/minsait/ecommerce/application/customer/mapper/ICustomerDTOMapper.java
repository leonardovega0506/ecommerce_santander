package com.minsait.ecommerce.application.customer.mapper;

import com.minsait.ecommerce.domain.customer.model.dto.CustomerDTO;
import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;




@Mapper(componentModel = "spring")
public interface ICustomerDTOMapper {

    @Mapping(source = "id",target = "id")
    @Mapping(source = "name",target = "name")
    @Mapping(source = "lastName",target = "lastName")
    @Mapping(source = "email",target = "email")
    @Mapping(source = "phone",target = "phone")
    @Mapping(source = "address",target = "address")
    CustomerDTO toDTO(CustomerModel domain);
}
