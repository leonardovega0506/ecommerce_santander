package com.minsait.ecommerce.infraestructure.customer.adapter.jpa;

import com.minsait.ecommerce.infraestructure.customer.adapter.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerJPAAdapterRepository extends JpaRepository<CustomerEntity,Long> {
    boolean existsByNameAndLastName(String name, String lastName);

    boolean existsByEmail(String email);

    @Override
    boolean existsById(Long aLong);
}
