package com.minsait.ecommerce.infraestructure.purchase.adapter.jpa.dao;


import com.minsait.ecommerce.domain.purchase.port.dao.IProductValidationDAO;
import com.minsait.ecommerce.infraestructure.product.adapater.jpa.IProductJPAAdapterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductValidationAdapater implements IProductValidationDAO {

    private final IProductJPAAdapterRepository productRespository;


    @Override
    public boolean existProduct(Long productId) {
        return productRespository.existsById(productId);
    }
}
