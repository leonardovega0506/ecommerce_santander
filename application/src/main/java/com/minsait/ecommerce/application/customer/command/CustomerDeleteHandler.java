package com.minsait.ecommerce.application.customer.command;

import com.minsait.ecommerce.application.customer.mapper.ICustomerDTOMapper;
import com.minsait.ecommerce.domain.customer.service.CustomerDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerDeleteHandler {

    private final ICustomerDTOMapper customerDTOMapper;
    private final CustomerDeleteService customerDeleteService;

    public void excute(Long id){
        customerDeleteService.execute(id);
    }
}
