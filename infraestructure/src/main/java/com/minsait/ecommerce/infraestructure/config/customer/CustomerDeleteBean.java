package com.minsait.ecommerce.infraestructure.config.customer;

import com.minsait.ecommerce.domain.customer.port.repository.ICustomerRepository;
import com.minsait.ecommerce.domain.customer.service.CustomerDeleteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerDeleteBean {

    @Bean
    public CustomerDeleteService customerDeleteService(ICustomerRepository customerRepository){
        return new CustomerDeleteService(customerRepository);
    }
}
