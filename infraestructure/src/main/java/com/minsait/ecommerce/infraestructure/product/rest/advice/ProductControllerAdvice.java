package com.minsait.ecommerce.infraestructure.product.rest.advice;

import com.minsait.ecommerce.domain.product.model.exception.ProductException;
import com.minsait.ecommerce.domain.product.model.exception.ProductIllegalException;
import com.minsait.ecommerce.domain.product.model.exception.ProductNotFoundException;
import com.minsait.ecommerce.infraestructure.product.adapater.ProductErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ProductControllerAdvice {

    @ExceptionHandler(ProductIllegalException.class)
    public ResponseEntity<ProductErrorResponse> handleProductInputException(ProductIllegalException e){
        ProductErrorResponse response = new ProductErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST.value(), "Producto invalido",e.getErrorMessage());

        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ProductException.class)
    public ResponseEntity<ProductErrorResponse> handleProductException(ProductException e){
        ProductErrorResponse response = new ProductErrorResponse(LocalDateTime.now(), HttpStatus.BAD_REQUEST.value(), "Producto ya existente", e.getErrorMessage());
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ProductErrorResponse> handleProductNotFoundException(ProductNotFoundException nf){
        ProductErrorResponse response = new ProductErrorResponse(LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(), "Not Found",
                nf.getMessage());

        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }


}
