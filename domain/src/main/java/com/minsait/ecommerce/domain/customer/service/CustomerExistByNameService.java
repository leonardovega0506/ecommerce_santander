package com.minsait.ecommerce.domain.customer.service;

import com.minsait.ecommerce.domain.customer.port.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerExistByNameService {

    private final ICustomerRepository customerRepository;

    public boolean execute(String name,String lastName){
        return customerRepository.existsByName(name,lastName);
    }
}
