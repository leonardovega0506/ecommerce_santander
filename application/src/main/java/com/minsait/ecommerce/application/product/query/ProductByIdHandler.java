package com.minsait.ecommerce.application.product.query;

import com.minsait.ecommerce.application.product.mapper.IProductDTOMapper;
import com.minsait.ecommerce.domain.product.model.dto.ProductDTO;
import com.minsait.ecommerce.domain.product.service.ProductByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductByIdHandler {

    private final IProductDTOMapper productDTOMapper;
    private final ProductByIdService productByIdService;

    public ProductDTO execute(Long id){
        return productDTOMapper.toDTO(productByIdService.execute(id));
    }
}
