package com.minsait.ecommerce.application.product.command;

import com.minsait.ecommerce.application.product.mapper.IProductDTOMapper;
import com.minsait.ecommerce.domain.product.service.ProductDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductDeleteHandler {

    private final IProductDTOMapper productDTOMapper;
    private final ProductDeleteService productDeleteService;

    public void execute(Long id){
        productDeleteService.execute(id);
    }
}
