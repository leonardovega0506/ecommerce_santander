package com.minsait.ecommerce.domain.purchase.service;

import com.minsait.ecommerce.domain.purchase.port.dao.ICustomerValidationDAO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerValidationService {

    private final ICustomerValidationDAO customerValidationDAO;

    public boolean execute(Long id){
        return customerValidationDAO.existsCustomer(id);
    }
}
