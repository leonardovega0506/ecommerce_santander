package com.minsait.ecommerce.domain.customer.service;

import com.minsait.ecommerce.domain.customer.port.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerDeleteService {

    private final ICustomerRepository customerRepository;

    public void execute(Long id){
        customerRepository.delete(id);
    }
}
