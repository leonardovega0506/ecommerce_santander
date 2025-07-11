package com.minsait.ecommerce.infraestructure.config.customer;

import com.minsait.ecommerce.domain.customer.port.dao.ICustomerDAO;
import com.minsait.ecommerce.domain.customer.service.CustomerAllService;
import com.minsait.ecommerce.domain.customer.service.CustomerByIdService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerDAOBean {

    @Bean
    public CustomerAllService customerAllService(ICustomerDAO customerDAO){
        return new CustomerAllService(customerDAO);
    }

    @Bean
    public CustomerByIdService customerByIdService(ICustomerDAO customerDAO){
        return new CustomerByIdService(customerDAO);
    }
}
