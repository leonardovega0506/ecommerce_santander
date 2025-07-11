package com.minsait.ecommerce.infraestructure.config.product;

import com.minsait.ecommerce.domain.product.port.dao.IProductDAO;
import com.minsait.ecommerce.domain.product.service.ProductAllService;
import com.minsait.ecommerce.domain.product.service.ProductByIdService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductDAOBean {

    @Bean
    public ProductAllService productAllService(IProductDAO productDAO){
        return new ProductAllService(productDAO);
    }

    @Bean
    public ProductByIdService productByIdService(IProductDAO productDAO){
        return new ProductByIdService(productDAO);
    }
}
