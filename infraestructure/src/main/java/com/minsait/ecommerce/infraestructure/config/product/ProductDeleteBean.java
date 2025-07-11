package com.minsait.ecommerce.infraestructure.config.product;

import com.minsait.ecommerce.domain.product.port.repository.IProductRepository;
import com.minsait.ecommerce.domain.product.service.ProductDeleteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductDeleteBean {

    @Bean
    public ProductDeleteService productDeleteService(IProductRepository productRepository){
        return new ProductDeleteService(productRepository);
    }
}
