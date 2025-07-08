package com.minsait.ecommerce.domain.customer.port.repository;

import com.minsait.ecommerce.domain.customer.model.entity.CustomerEntity;

public interface ICustomerRepository {
    CustomerEntity create(CustomerEntity customer);
}
