package com.minsait.ecommerce.application.customer.command;

import com.minsait.ecommerce.application.customer.mapper.ICustomerDTOMapper;
import com.minsait.ecommerce.domain.customer.model.dto.CustomerDTO;
import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;
import com.minsait.ecommerce.domain.customer.service.CustomerUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerUpdateHandler {

    private final ICustomerDTOMapper customerDTOMapper;
    private final CustomerUpdateService customerUpdateService;

    public CustomerDTO execute(Long id, CustomerModel body){
        return customerDTOMapper.toDTO(customerUpdateService.execute(id,body));
    }
}
