package com.minsait.ecommerce.application.customer.query;

import com.minsait.ecommerce.domain.customer.service.CustomerExistByNameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerExistByNameHandler {

    private final CustomerExistByNameService customerExistByNameService;

    public boolean execute(String name,String lastName){
        return customerExistByNameService.execute(name,lastName);
    }
}
