package com.minsait.ecommerce.domain.customer.service;

import com.minsait.ecommerce.domain.customer.port.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerExistByEmailService {

    private final ICustomerRepository customerRepository;

    public boolean execute(String email){
        return customerRepository.existsByEmail(email);
    }
}
