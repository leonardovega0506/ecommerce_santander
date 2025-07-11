package com.minsait.ecommerce.infraestructure.purchase.rest;

import com.minsait.ecommerce.application.purchase.command.PurchaseCreateHandler;
import com.minsait.ecommerce.domain.purchase.model.dto.PurchaseDTO;
import com.minsait.ecommerce.domain.purchase.model.dto.command.PurchaseCreateCommand;
import com.minsait.ecommerce.infraestructure.purchase.adapter.mapper.PurchaseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/purchase")
public class PurchaseCommandController {
    private PurchaseCreateHandler purchaseCreateHandler;
    private PurchaseMapper purchaseMapper;

    @PostMapping
    public ResponseEntity<PurchaseDTO> save(@RequestBody PurchaseCreateCommand body){
        return new ResponseEntity<>(purchaseCreateHandler.execute(body), HttpStatus.CREATED);
    }
}
