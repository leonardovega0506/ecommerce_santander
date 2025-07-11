package com.minsait.ecommerce.application.product.command;

import com.minsait.ecommerce.application.product.mapper.IProductDTOMapper;
import com.minsait.ecommerce.application.purchase.mapper.IPurchaseDTOMapper;
import com.minsait.ecommerce.domain.product.model.dto.ProductDTO;
import com.minsait.ecommerce.domain.product.model.dto.command.ProductCreateCommand;
import com.minsait.ecommerce.domain.product.service.ProductCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductCreateHandler {

    private final IProductDTOMapper productDTOMapper;
    private final ProductCreateService productCreateService;

    public ProductDTO execute(ProductCreateCommand body){
        return productDTOMapper.toDTO(productCreateService.execute(body));
    }
}
