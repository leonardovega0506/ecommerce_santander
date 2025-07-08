package com.minsait.ecommerce.infraestructure.customer.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerCommandController {

    private final CustomerCreateHandler clienteCreateHandler;

    @PostMapping()
    public CustomerDTO create(@RequestBody CustomerCreateCommand customerCreateCommand){
        return customerCreateHandler.execute(customerCreateCommand);
    }
}
