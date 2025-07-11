package com.minsait.ecommerce.infraestructure.config.purchase;

import com.minsait.ecommerce.domain.purchase.port.dao.IProductValidationDAO;
import com.minsait.ecommerce.domain.purchase.service.ProductValidationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductValidationBean {

    @Bean
    public ProductValidationService productValidationService(IProductValidationDAO productValidationDAO){
        return new ProductValidationService(productValidationDAO);
    }
}
