package com.minsait.ecommerce.domain.customer.service;

import java.util.List;

import com.minsait.ecommerce.domain.customer.model.dto.command.CustomerCreateCommand;
import com.minsait.ecommerce.domain.customer.model.entity.CustomerEntity;
import com.minsait.ecommerce.domain.customer.port.dao.ICustomerDAO;
import com.minsait.ecommerce.domain.customer.port.repository.ICustomerRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerService {

    private final ICustomerDAO customerDAO;
    private final ICustomerRepository customerRepository;

    public List<CustomerEntity> findAll(){
        return customerDAO.findAll();
    }

    public CustomerEntity findById(long id){
        return customerDAO.findById(id);
    }

    public CustomerEntity save(CustomerEntity body){
        return customerRepository.create(body);
    }

    public CustomerEntity execute(CustomerCreateCommand clienteCreateCommand){
        CustomerEntity clienteToCreate = new CustomerEntity().requestToCreate(clienteCreateCommand);
        return customerRepository.create(clienteToCreate);
    }

}
