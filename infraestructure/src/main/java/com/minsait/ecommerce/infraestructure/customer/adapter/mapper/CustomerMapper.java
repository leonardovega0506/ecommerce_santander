package com.minsait.ecommerce.infraestructure.customer.adapter.mapper;

import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;
import org.springframework.stereotype.Component;

import com.minsait.ecommerce.infraestructure.customer.adapter.entity.CustomerEntity;

@Component
public class CustomerMapper {

        public CustomerModel toDomain(CustomerEntity entity) {
		if (entity == null) {
			return null;
		}
		return new CustomerModel(entity.getId()
				,entity.getName(),entity.getName(),
				entity.getEmail(),
				entity.getPhone(),
				entity.getAddress());
	}

	public CustomerEntity toEntity(CustomerModel model) {
		if (model == null) {
			return null;
		}
		return new CustomerEntity(model.getId().getId(),
				model.getName().getName(), model.getLastName().getLastName(),
				model.getEmail().getEmail(),
				model.getPhone().getPhone(),model.getAddress().getAddress());
	}

}
