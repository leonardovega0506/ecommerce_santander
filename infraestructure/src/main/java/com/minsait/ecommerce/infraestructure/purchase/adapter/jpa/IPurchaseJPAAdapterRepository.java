package com.minsait.ecommerce.infraestructure.purchase.adapter.jpa;

import com.minsait.ecommerce.infraestructure.purchase.adapter.entity.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPurchaseJPAAdapterRepository extends JpaRepository<PurchaseEntity,Long> {
}
