package com.minsait.ecommerce.domain.customer.service;

import com.minsait.ecommerce.domain.customer.model.dto.command.CustomerCreateCommand;
import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;
import com.minsait.ecommerce.domain.customer.model.exception.CustomerException;
import com.minsait.ecommerce.domain.customer.model.exception.CustomerInputException;
import com.minsait.ecommerce.domain.customer.port.repository.ICustomerRepository;
import com.minsait.ecommerce.domain.message.port.IMessageRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerCreateService {

    private final ICustomerRepository customerRepository;
    private final IMessageRepository messageRepository;

    public CustomerModel execute(CustomerCreateCommand body){
        validateCustomer(body);
        CustomerModel newCustomer = new CustomerModel().requestToCreate(body);
        messageRepository.publishMessage("Customer created: "+ newCustomer.toString());

        return customerRepository.create(newCustomer);
    }

    private void validateCustomer(CustomerCreateCommand body){
        if(!body.getName().equals(null) || body.getName().isBlank())
            throw new CustomerInputException("El campo nombre no esta definido");
        if(!body.getLastName().equals(null) || body.getLastName().isBlank())
            throw new CustomerInputException("El campo apellido no esta definido");
        if(!body.getEmail().equals(null) || body.getEmail().isBlank())
            throw new CustomerInputException("El campo email no esta definido");
        if(!body.getPhone().equals(null) || body.getPhone().isBlank())
            throw new CustomerInputException("El campo telefono no esta definido");
        if(!body.getAddress().equals(null) || body.getAddress().isBlank())
            throw new CustomerInputException("El campo direccion no esta definido");
        if(customerRepository.existsByEmail(body.getEmail()))
                throw new CustomerException("El correo electronico ya esta registrado");
        if(customerRepository.existsByName(body.getName(),body.getLastName()))
            throw new CustomerException("El nombre ya esta registrado");
    }

}
