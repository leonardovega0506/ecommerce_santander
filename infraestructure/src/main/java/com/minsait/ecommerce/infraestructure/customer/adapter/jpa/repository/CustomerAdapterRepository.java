package com.minsait.ecommerce.infraestructure.customer.adapter.jpa.repository;

import com.minsait.ecommerce.domain.customer.model.entity.CustomerModel;
import com.minsait.ecommerce.domain.customer.model.exception.CustomerNotFoundException;
import com.minsait.ecommerce.domain.customer.port.repository.ICustomerRepository;
import com.minsait.ecommerce.infraestructure.customer.adapter.entity.CustomerEntity;
import com.minsait.ecommerce.infraestructure.customer.adapter.jpa.ICustomerJPAAdapterRepository;
import com.minsait.ecommerce.infraestructure.customer.adapter.mapper.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CustomerAdapterRepository implements ICustomerRepository {

    private final ICustomerJPAAdapterRepository customerAdapterRepository;
    private final CustomerMapper mapper;

    @Override
    public CustomerModel create(CustomerModel customer) {
        return mapper.toDomain(customerAdapterRepository.save(mapper.toEntity(customer)));
    }

    @Override
    public CustomerModel update(Long id, CustomerModel customer) {
        CustomerEntity customerGet = customerAdapterRepository.findById(id)
                .orElseThrow(()-> new CustomerNotFoundException("Cliente no encontrado"));
        customerGet.setName(String.valueOf(customer.getName()));
        customerGet.setLastName(String.valueOf(customer.getLastName()));
        customerGet.setAddress(String.valueOf(customer.getAddress()));
        customerGet.setEmail(String.valueOf(customer.getEmail()));
        customerGet.setPhone(String.valueOf(customer.getPhone()));

        CustomerEntity customerUpdated = customerAdapterRepository.save(customerGet);

        return mapper.toDomain(customerUpdated);
    }

    @Override
    public void delete(Long id) {
        customerAdapterRepository.deleteById(id);
    }

    @Override
    public boolean existsByName(String name,String lasName) {
        return customerAdapterRepository.existsByNameAndLastName(name,lasName);
    }

    @Override
    public boolean existsByEmail(String email) {
        return customerAdapterRepository.existsByEmail(email);
    }


}
