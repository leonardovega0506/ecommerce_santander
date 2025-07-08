package com.minsait.ecommerce.infraestructure.customer.adapter.mapper;

import org.springframework.stereotype.Component;

import com.minsait.ecommerce.infraestructure.customer.adapter.entity.CustomerEntity;

@Component
public class CustomerDBMapper {

        public CustomerEntity toDbo(CustomerEntity domain) {
		if (domain == null) {
			return null;
		}
		return new CustomerEntity(domain.getId(), domain.getName(), domain.getLastName(), domain.getEmail(),
				domain.getPhone(),domain.getAddress());
	}

	public CustomerEntity toDomain(CustomerEntity entity) {
		if (entity == null) {
			return null;
		}
		return new CustomerEntity(entity.getId(), entity.getName(), entity.getLastName(), entity.getEmail(),
				entity.getPhone(),entity.getAddress());
	}

	public CustomerEntity toDboCreate(CustomerEntity domain) {
		if(domain == null){
            return null;
        }
		return new CustomerEntity(domain.getId(),domain.getName(),domain.getLastName(),domain.getEmail(),
        domain.getPhone(),domain.getAddress());
	}
}
