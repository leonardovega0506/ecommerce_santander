package com.minsait.ecommerce.domain.customer.service;

import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;
import com.minsait.ecommerce.domain.customer.port.dao.ICustomerDAO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerByIdService {

    private final ICustomerDAO customerDAO;

    public CustomerModel execute(Long id){
        return customerDAO.findById(id);
    }
}

