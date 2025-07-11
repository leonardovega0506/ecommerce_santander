package com.minsait.ecommerce.infraestructure.customer.rest.advice;

import com.minsait.ecommerce.domain.customer.model.exception.CustomerException;
import com.minsait.ecommerce.domain.customer.model.exception.CustomerInputException;
import com.minsait.ecommerce.domain.customer.model.exception.CustomerNotFoundException;
import com.minsait.ecommerce.infraestructure.customer.adapter.CustomerErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomerControllerAdvice {

    @ExceptionHandler(CustomerException.class)
    public ResponseEntity<CustomerErrorResponse> handleCustomerException(CustomerException ex){
        CustomerErrorResponse response = new CustomerErrorResponse(LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(),"Cliente malo",ex.getMessage());
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomerInputException.class)
    public ResponseEntity<CustomerErrorResponse> handleCustomerInputException(CustomerInputException ex){
        CustomerErrorResponse response = new CustomerErrorResponse(LocalDateTime.now(),
                HttpStatus.BAD_REQUEST.value(), "Datos invalidos",ex.getMessage());

        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<CustomerErrorResponse> handleCustomerNotFoundException(CustomerNotFoundException nf){
        CustomerErrorResponse response = new CustomerErrorResponse(LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(), "Not Found",
                nf.getMessage());

        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }

}
