package com.minsait.ecommerce.infraestructure.customer.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerQueryController {

    private final CustomerByIdHandler customerByIdHandler;
    private final CustomerAllHandler customerAllHandler;

    public CustomerQueryController(CustomerAllHandler customerAllHandler, CustomerByIdHandler customerByIdHandler){
        this.customerAllHandler = customerAllHandler;
        this.customerByIdHandler = customerByIdHandler;
    }

    @GetMapping
	public List<CustomerDTO> getAll() {
		return customerAllHandler.execute();
	}

	@GetMapping("/{id}")
	public CustomerDTO getById(@PathVariable("id") Long id) {
		return customerByIdHandler.execute(id);
	}
}
