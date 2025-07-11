package com.minsait.ecommerce.infraestructure.purchase.adapter.jpa.dao;

import com.minsait.ecommerce.domain.purchase.port.dao.ICustomerValidationDAO;
import com.minsait.ecommerce.infraestructure.customer.adapter.jpa.ICustomerJPAAdapterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerValidationAdapater implements ICustomerValidationDAO {

    private ICustomerJPAAdapterRepository customerJPAAdapterRepository;

    @Override
    public boolean existsCustomer(Long customerId) {
        return customerJPAAdapterRepository.existsById(customerId);
    }
}
