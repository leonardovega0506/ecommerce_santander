package com.minsait.ecommerce.domain.customer.port.dao;

import java.util.List;
import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;

public interface ICustomerDAO {

    CustomerModel findById(Long id);
    List<CustomerModel> findAll();

}
