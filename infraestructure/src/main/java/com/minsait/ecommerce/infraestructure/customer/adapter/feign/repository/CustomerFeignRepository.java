package com.minsait.ecommerce.infraestructure.customer.adapter.feign.repository;

import com.minsait.ecommerce.infraestructure.customer.adapter.entity.CustomerEntity;
import com.minsait.ecommerce.infraestructure.customer.adapter.mapper.CustomerDBMapper;

@Repository
@Transactional
@RequiredArgsConstructor
public class CustomerFeignRepository implements CustomerRepository{

    private final CustomerFeignRepository customerFeignAdapter;
    private final CustomerDBMapper customerBMapper;

    @Override
    public CustomerEntity create(CustomerEntity customerEntity) {
        var clienteToSave = customerBMapper.toDboCreate(cliente);
		var clienteSaved = customerFeignAdapter.(clienteToSave);
		return customerBMapper.toDomain(clienteSaved);
    }
       

}
