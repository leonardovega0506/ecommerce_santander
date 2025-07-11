package com.minsait.ecommerce.infraestructure.product.adapater.jpa;

import com.minsait.ecommerce.infraestructure.product.adapater.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductJPAAdapterRepository extends JpaRepository<ProductEntity,Long> {
    boolean existsByName(String name);
}
