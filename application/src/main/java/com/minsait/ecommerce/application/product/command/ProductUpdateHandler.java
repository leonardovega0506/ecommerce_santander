package com.minsait.ecommerce.application.product.command;

import com.minsait.ecommerce.application.product.mapper.IProductDTOMapper;
import com.minsait.ecommerce.domain.product.model.dto.ProductDTO;
import com.minsait.ecommerce.domain.product.service.ProductUpdateService;
import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductUpdateHandler {

    private final IProductDTOMapper productDTOMapper;
    private final ProductUpdateService productUpdateService;

    public ProductDTO execute(Long id, ProductModel body){
        return productDTOMapper.toDTO(productUpdateService.execute(id,body));
    }
}
