package com.minsait.ecommerce.infraestructure.config.purchase;

import com.minsait.ecommerce.domain.purchase.port.dao.IDataProductsDAO;
import com.minsait.ecommerce.domain.purchase.service.DataProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataProductBean {

    @Bean
    public DataProductService dataProductService(IDataProductsDAO productsDAO){
        return new DataProductService(productsDAO);
    }
}
