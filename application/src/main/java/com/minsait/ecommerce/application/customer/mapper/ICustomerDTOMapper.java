package com.minsait.ecommerce.application.customer.mapper;

import com.minsait.ecommerce.domain.customer.model.dto.CustomerDTO;
import com.minsait.ecommerce.domain.customer.model.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;




@Mapper
@Component
public interface ICustomerDTOMapper {

    @Mapping(source = "id",target = "id")
    @Mapping(source = "name",target = "name")
    @Mapping(source = "lastName",target = "lastName")
    @Mapping(source = "email",target = "email")
    @Mapping(source = "phone",target = "phone")
    @Mapping(source = "address",target = "addres")
    CustomerDTO toDto(CustomerEntity domain);
}
