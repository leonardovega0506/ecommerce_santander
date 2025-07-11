package com.minsait.ecommerce.infraestructure.product.rest.controller;

import com.minsait.ecommerce.application.product.command.ProductCreateHandler;
import com.minsait.ecommerce.application.product.command.ProductDeleteHandler;
import com.minsait.ecommerce.application.product.command.ProductUpdateHandler;
import com.minsait.ecommerce.domain.product.model.dto.ProductDTO;
import com.minsait.ecommerce.domain.product.model.dto.command.ProductCreateCommand;
import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductCommandController {

    private final ProductCreateHandler productCreateHandler;
    private final ProductDeleteHandler productDeleteHandler;
    private final ProductUpdateHandler productUpdateHandler;

    @PostMapping
    public ResponseEntity<ProductDTO> save(@RequestBody ProductCreateCommand body){
        return new ResponseEntity<>(productCreateHandler.execute(body), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable(value = "id") long id, ProductModel body){
        return new ResponseEntity<>(productUpdateHandler.execute(id,body),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable(value = "id") long id){
        productDeleteHandler.execute(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
