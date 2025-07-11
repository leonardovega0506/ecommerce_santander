package com.minsait.ecommerce.infraestructure.config.product;

import com.minsait.ecommerce.domain.message.port.IMessageRepository;
import com.minsait.ecommerce.domain.product.port.repository.IProductRepository;
import com.minsait.ecommerce.domain.product.service.ProductCreateService;
import com.minsait.ecommerce.domain.product.service.ProductExistByNameService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductCreateBean {

    @Bean
    public ProductCreateService productCreateService(IProductRepository productRepository, IMessageRepository messageRepository){
        return new ProductCreateService(productRepository,messageRepository);
    }

    @Bean
    public ProductExistByNameService productExistByNameService(IProductRepository productRepository){
        return new ProductExistByNameService(productRepository);
    }
}
