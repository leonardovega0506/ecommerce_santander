package com.minsait.ecommerce.application.customer.mapper;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

import com.minsait.ecommerce.customer.CustomerDTO;

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
