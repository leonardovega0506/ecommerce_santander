package com.minsait.ecommerce.domain.customer.port.dao;

import java.util.List;

import com.minsait.ecommerce.domain.customer.model.entity.CustomerEntity;

public interface ICustomerDAO {

    CustomerEntity findById(Long id);
    List<CustomerEntity> findAll();

}
