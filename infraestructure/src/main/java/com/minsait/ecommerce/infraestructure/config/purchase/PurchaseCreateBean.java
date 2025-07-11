package com.minsait.ecommerce.infraestructure.config.purchase;

import com.minsait.ecommerce.domain.purchase.port.dao.ICustomerValidationDAO;
import com.minsait.ecommerce.domain.purchase.port.dao.IDataProductsDAO;
import com.minsait.ecommerce.domain.purchase.port.dao.IProductValidationDAO;
import com.minsait.ecommerce.domain.purchase.port.repository.IPurchaseRepository;
import com.minsait.ecommerce.domain.purchase.service.PurchaseCreateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PurchaseCreateBean {

    @Bean
    public PurchaseCreateService purchaseCreateService(IPurchaseRepository purchaseRepository,
                                                       ICustomerValidationDAO customerValidationDAO,
                                                       IDataProductsDAO dataProductsDAO,
                                                       IProductValidationDAO productValidationDAO){
        return new PurchaseCreateService(customerValidationDAO,productValidationDAO,purchaseRepository,dataProductsDAO);
    }
}
