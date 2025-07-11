package com.minsait.ecommerce.infraestructure.customer.rest.controller;

import com.minsait.ecommerce.application.customer.command.CustomerCreateHandler;
import com.minsait.ecommerce.application.customer.command.CustomerDeleteHandler;
import com.minsait.ecommerce.application.customer.command.CustomerUpdateHandler;
import com.minsait.ecommerce.domain.customer.model.dto.CustomerDTO;
import com.minsait.ecommerce.domain.customer.model.dto.command.CustomerCreateCommand;
import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerCommandController {

    private final CustomerCreateHandler customerCreateHandler;
    private final CustomerDeleteHandler customerDeleteHandler;
    private final CustomerUpdateHandler customerUpdateHandler;

    @PostMapping
    public ResponseEntity<CustomerDTO> create(@RequestBody CustomerCreateCommand customerCreateCommand){
        return new ResponseEntity<>(customerCreateHandler.execute(customerCreateCommand), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerDTO> update(@PathVariable(value = "id") Long id, @RequestBody CustomerModel body){
        return new ResponseEntity<>(customerUpdateHandler.execute(id,body),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable(value = "id")Long id){
         customerDeleteHandler.excute(id);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
