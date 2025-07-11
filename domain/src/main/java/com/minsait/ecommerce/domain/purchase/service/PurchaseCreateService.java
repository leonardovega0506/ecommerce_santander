package com.minsait.ecommerce.domain.purchase.service;

import com.minsait.ecommerce.domain.customer.model.exception.CustomerNotFoundException;
import com.minsait.ecommerce.domain.product.model.entity.ProductModel;
import com.minsait.ecommerce.domain.product.model.exception.ProductIllegalException;
import com.minsait.ecommerce.domain.purchase.model.dto.ProductQuantityDTO;
import com.minsait.ecommerce.domain.purchase.model.dto.command.PurchaseCreateCommand;
import com.minsait.ecommerce.domain.purchase.model.entity.PurchaseDetailModel;
import com.minsait.ecommerce.domain.purchase.model.entity.PurchaseModel;
import com.minsait.ecommerce.domain.purchase.port.dao.ICustomerValidationDAO;
import com.minsait.ecommerce.domain.purchase.port.dao.IDataProductsDAO;
import com.minsait.ecommerce.domain.purchase.port.dao.IProductValidationDAO;
import com.minsait.ecommerce.domain.purchase.port.repository.IPurchaseRepository;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class PurchaseCreateService {

    private final ICustomerValidationDAO customerValidationDAO;
    private final IProductValidationDAO productValidationDAO;
    private final IPurchaseRepository purchaseRepository;
    private final IDataProductsDAO productsDAO;

    public PurchaseModel execute(PurchaseCreateCommand body){
        List<PurchaseDetailModel> details = new ArrayList<>();
        BigDecimal total = BigDecimal.ZERO;

        if(!customerValidationDAO.existsCustomer(body.getCustomerId())){
            throw new CustomerNotFoundException("Not found customer");
        }

        for(ProductQuantityDTO productGet: body.getProducts()){
            if(productGet == null){
                throw new ProductIllegalException("Producto vacio");
            }
            if(productGet.getQuantity()<=0){
                throw new ProductIllegalException("Producto menor o igual a 0");
            }
            if(productValidationDAO.existProduct(productGet.getProductId())){
                throw new ProductIllegalException("Producto no existente");
            }

            ProductModel product = productsDAO.getData(productGet.getProductId());
            PurchaseDetailModel purchaseDetail = new PurchaseDetailModel();
            purchaseDetail.setProductId(product.getId().getId());
            purchaseDetail.setName(product.getName().getName());
            purchaseDetail.setQuantity(productGet.getQuantity());
            purchaseDetail.setUnitPrice(product.getPrice().getPrice());
            details.add(purchaseDetail);

            total = total.add(purchaseDetail.getUnitPrice().multiply(BigDecimal.valueOf(purchaseDetail.getQuantity())));
        }

        PurchaseModel newPurchase = new PurchaseModel();
        newPurchase.setCustomerId(body.getCustomerId());
        newPurchase.setProducts(details);
        newPurchase.setTotalPrice(total);
        newPurchase.setCreatedAt(LocalDateTime.now());

        return purchaseRepository.savePurchase(newPurchase);
    }
}
