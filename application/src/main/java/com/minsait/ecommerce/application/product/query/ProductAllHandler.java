package com.minsait.ecommerce.application.product.query;

import com.minsait.ecommerce.application.product.mapper.IProductDTOMapper;
import com.minsait.ecommerce.domain.product.model.dto.ProductDTO;
import com.minsait.ecommerce.domain.product.service.ProductAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class ProductAllHandler {

    private final IProductDTOMapper productDTOMapper;
    private final ProductAllService productAllService;

    public List<ProductDTO> execute(){
        return productAllService.execute().stream().map(productDTOMapper::toDTO).collect(Collectors.toList());
    }
}
