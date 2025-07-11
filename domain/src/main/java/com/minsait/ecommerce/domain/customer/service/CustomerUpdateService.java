package com.minsait.ecommerce.domain.customer.service;

import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;
import com.minsait.ecommerce.domain.customer.port.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerUpdateService {

    private final ICustomerRepository customerRepository;

    public CustomerModel execute(Long id,CustomerModel body){
        return customerRepository.update(id,body);
    }
}
