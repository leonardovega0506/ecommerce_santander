package com.minsait.ecommerce.application.customer.query;

import com.minsait.ecommerce.application.customer.mapper.ICustomerDTOMapper;
import com.minsait.ecommerce.domain.customer.model.dto.CustomerDTO;
import com.minsait.ecommerce.domain.customer.service.CustomerAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class CustomerAllHandler {

    private final ICustomerDTOMapper customerDTOMapper;
    private final CustomerAllService customerAllService;

    public List<CustomerDTO> execute(){
        return customerAllService.execute().stream().map(customerDTOMapper::toDTO).collect(Collectors.toList());
    }
}
