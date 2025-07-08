package com.minsait.ecommerce.application.customer.command;

import com.minsait.ecommerce.application.customer.mapper.ICustomerDTOMapper;
import com.minsait.ecommerce.domain.customer.model.dto.CustomerDTO;
import com.minsait.ecommerce.domain.customer.model.dto.command.CustomerCreateCommand;
import com.minsait.ecommerce.domain.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerCreateHandler {
    private final ICustomerDTOMapper customerDtoMapper;
    private final CustomerService clienteCreateService;

    public CustomerDTO execute(CustomerCreateCommand customerCreateCommand){
        return customerDtoMapper.toDto(clienteCreateService.execute(customerCreateCommand));
    }
}
