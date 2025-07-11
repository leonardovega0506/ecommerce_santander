package com.minsait.ecommerce.application.customer.query;

import com.minsait.ecommerce.application.customer.mapper.ICustomerDTOMapper;
import com.minsait.ecommerce.domain.customer.model.dto.CustomerDTO;
import com.minsait.ecommerce.domain.customer.service.CustomerByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerByIdHandler {

    private final ICustomerDTOMapper customerDTOMapper;
    private final CustomerByIdService customerByIdService;

    public CustomerDTO execute(Long id){
        return customerDTOMapper.toDTO(customerByIdService.execute(id));
    }
}
