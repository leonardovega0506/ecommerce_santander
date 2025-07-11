package com.minsait.ecommerce.application.product.query;

import com.minsait.ecommerce.domain.product.service.ProductExistByNameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductExistByNameHandler {

    private final ProductExistByNameService productExistByNameService;

    public boolean execute(String name){
        return productExistByNameService.execute(name);
    }
}
