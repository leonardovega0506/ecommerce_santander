package com.minsait.ecommerce.application.customer.query;

import com.minsait.ecommerce.application.customer.mapper.ICustomerDTOMapper;
import com.minsait.ecommerce.domain.customer.model.dto.CustomerDTO;
import com.minsait.ecommerce.domain.customer.model.entity.CustomerEntity;
import com.minsait.ecommerce.domain.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class CustomerHandler {

    private final ICustomerDTOMapper customerDtoMapper;
    private final CustomerService customerService;

    public List<CustomerDTO> execute(){
        return customerService.findAll().stream().map(customerDtoMapper::toDto).collect(Collectors.toList());
    }
}
