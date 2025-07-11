package com.minsait.ecommerce.infraestructure.product.rest.controller;

import com.minsait.ecommerce.application.product.query.ProductAllHandler;
import com.minsait.ecommerce.application.product.query.ProductByIdHandler;
import com.minsait.ecommerce.domain.product.model.dto.ProductDTO;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductQueryController {

    private final ProductAllHandler productAllHandler;
    private final ProductByIdHandler productByIdHandler;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll(){
        return new ResponseEntity<>(productAllHandler.execute(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable(value = "Id") long id){
        return new ResponseEntity<>(productByIdHandler.execute(id),HttpStatus.OK);
    }

}
