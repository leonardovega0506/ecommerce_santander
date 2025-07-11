package com.minsait.ecommerce.domain.customer.port.repository;

import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;

public interface ICustomerRepository {
    CustomerModel create(CustomerModel customer);
    CustomerModel update(Long id, CustomerModel customer);
    void delete(Long id);
    boolean existsByName(String name,String lastName);
    boolean existsByEmail(String email);
}
