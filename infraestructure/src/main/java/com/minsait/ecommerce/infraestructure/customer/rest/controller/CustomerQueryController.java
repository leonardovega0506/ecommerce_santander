package com.minsait.ecommerce.infraestructure.customer.rest.controller;

import com.minsait.ecommerce.application.customer.query.CustomerAllHandler;
import com.minsait.ecommerce.application.customer.query.CustomerByIdHandler;
import com.minsait.ecommerce.domain.customer.model.dto.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
	public ResponseEntity<List<CustomerDTO>> getAll() {
		return new ResponseEntity<>(customerAllHandler.execute(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CustomerDTO> getById(@PathVariable("id") Long id) {
		return new ResponseEntity<>(customerByIdHandler.execute(id),HttpStatus.OK);
	}
}
