package com.minsait.ecommerce.infraestructure.config.customer;

import com.minsait.ecommerce.domain.customer.port.repository.ICustomerRepository;
import com.minsait.ecommerce.domain.customer.service.CustomerUpdateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerUpdateBean {

    @Bean
    public CustomerUpdateService customerUpdateService(ICustomerRepository customerRepository){
        return new CustomerUpdateService(customerRepository);
    }
}
