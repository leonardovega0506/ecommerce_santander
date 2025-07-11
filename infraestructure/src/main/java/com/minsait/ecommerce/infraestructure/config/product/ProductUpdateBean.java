package com.minsait.ecommerce.infraestructure.config.product;

import com.minsait.ecommerce.domain.product.port.repository.IProductRepository;
import com.minsait.ecommerce.domain.product.service.ProductUpdateService;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductUpdateBean {

    public ProductUpdateService productUpdateService(IProductRepository productRepository){
        return new ProductUpdateService(productRepository);
    }
}
