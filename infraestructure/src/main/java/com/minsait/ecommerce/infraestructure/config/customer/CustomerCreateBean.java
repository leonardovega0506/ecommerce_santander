package com.minsait.ecommerce.infraestructure.config.customer;

import com.minsait.ecommerce.domain.customer.port.repository.ICustomerRepository;
import com.minsait.ecommerce.domain.customer.service.CustomerCreateService;
import com.minsait.ecommerce.domain.customer.service.CustomerExistByEmailService;
import com.minsait.ecommerce.domain.customer.service.CustomerExistByNameService;
import com.minsait.ecommerce.domain.message.port.IMessageRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerCreateBean {

    @Bean
    public CustomerCreateService customerCreateService(ICustomerRepository customerRepository, IMessageRepository messageRepository){
        return new CustomerCreateService(customerRepository,messageRepository);
    }

    @Bean
    public CustomerExistByEmailService customerExistByEmailService(ICustomerRepository customerRepository){
        return new CustomerExistByEmailService(customerRepository);
    }

    @Bean
    public CustomerExistByNameService customerExistByNameService(ICustomerRepository customerRepository){
        return new CustomerExistByNameService(customerRepository);
    }
}
