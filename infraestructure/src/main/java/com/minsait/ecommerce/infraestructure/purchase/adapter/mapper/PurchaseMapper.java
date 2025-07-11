package com.minsait.ecommerce.infraestructure.purchase.adapter.mapper;

import com.minsait.ecommerce.domain.purchase.model.entity.PurchaseDetailModel;
import com.minsait.ecommerce.domain.purchase.model.entity.PurchaseModel;
import com.minsait.ecommerce.infraestructure.purchase.adapter.entity.DetailPurchaseEntity;
import com.minsait.ecommerce.infraestructure.purchase.adapter.entity.PurchaseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PurchaseMapper {

    public PurchaseEntity toEntity(PurchaseModel model){
        PurchaseEntity entity = new PurchaseEntity();
        entity.setId(model.getId());
        entity.setCustomerId(model.getCustomerId());
        entity.setTotalPrice(model.getTotalPrice());
        entity.setCreatedAt(model.getCreatedAt());

        List<DetailPurchaseEntity> detail = model.getProducts().stream().map(p ->{
            DetailPurchaseEntity de = new DetailPurchaseEntity();
            de.setProductId(p.getProductId());
            de.setId(p.getProductId());
            de.setName(p.getName());
            de.setQuantity(p.getQuantity());
            de.setPurchase(entity);
            return de;
        }).toList();

        entity.setProducts(detail);

        return entity;

    }

    public PurchaseModel toDomain(PurchaseEntity entity){
        PurchaseModel model = new PurchaseModel();
        model.setId(entity.getId());
        model.setCustomerId(entity.getCustomerId());
        model.setTotalPrice(entity.getTotalPrice());
        model.setCreatedAt(entity.getCreatedAt());

        List<PurchaseDetailModel> detail = entity.getProducts().stream().map(d->{
            PurchaseDetailModel dm = new PurchaseDetailModel();
            dm.setProductId(d.getProductId());
            dm.setName(d.getName());
            dm.setQuantity(d.getQuantity());
            dm.setUnitPrice(d.getUnitPrice());
            return dm;
        }).toList();

        model.setProducts(detail);
        return model;
    }
}
