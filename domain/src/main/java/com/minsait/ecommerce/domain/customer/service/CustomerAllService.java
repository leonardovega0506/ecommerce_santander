package com.minsait.ecommerce.domain.customer.service;

import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;
import com.minsait.ecommerce.domain.customer.port.dao.ICustomerDAO;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CustomerAllService {

    private final ICustomerDAO customerDAO;

    public List<CustomerModel> execute(){
        return customerDAO.findAll();
    }
}
