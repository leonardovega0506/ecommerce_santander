package com.minsait.ecommerce.infraestructure.config.purchase;

import com.minsait.ecommerce.domain.purchase.port.dao.ICustomerValidationDAO;
import com.minsait.ecommerce.domain.purchase.service.CustomerValidationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerValidationBean {

    @Bean
    public CustomerValidationService customerValidationService(ICustomerValidationDAO customerValidationDAO){
        return new CustomerValidationService(customerValidationDAO);
    }
}
