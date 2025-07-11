package com.minsait.ecommerce.domain.purchase.port.dao;

public interface ICustomerValidationDAO {

    boolean existsCustomer(Long customerId);
}
