package com.minsait.ecommerce.application.customer.query;

import com.minsait.ecommerce.domain.customer.service.CustomerExistByEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerExistByEmailHandler {

    private final CustomerExistByEmailService customerExistByEmailService;

    public boolean execute(String email){
        return customerExistByEmailService.execute(email);
    }
}
