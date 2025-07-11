package com.minsait.ecommerce.infraestructure.customer.adapter.jpa.dao;

import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;
import com.minsait.ecommerce.domain.customer.model.exception.CustomerNotFoundException;
import com.minsait.ecommerce.domain.customer.port.dao.ICustomerDAO;
import com.minsait.ecommerce.infraestructure.customer.adapter.jpa.ICustomerJPAAdapterRepository;
import com.minsait.ecommerce.infraestructure.customer.adapter.mapper.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class CustomerAdapterDAO implements ICustomerDAO {

    private final ICustomerJPAAdapterRepository customerAdapterRepository;
    private final CustomerMapper mapper;

    @Override
    public CustomerModel findById(Long id) {
        return mapper.toDomain(customerAdapterRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Cliente no encontrado")));
    }

    @Override
    public List<CustomerModel> findAll() {
        return customerAdapterRepository.findAll().stream().map(mapper::toDomain).collect(Collectors.toList());
    }



}
