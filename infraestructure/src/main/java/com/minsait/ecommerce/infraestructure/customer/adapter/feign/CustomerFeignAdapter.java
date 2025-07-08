package com.minsait.ecommerce.infraestructure.customer.adapter.feign;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.minsait.ecommerce.infraestructure.customer.adapter.entity.CustomerEntity;

//@FeignClient(name = "${feign.clientes.name}", url = "${feign.clientes.base-url}")
public interface CustomerFeignAdapter{

    //@RequestMapping(method = RequestMethod.GET, value = "${feign.clientes-resource}")
    List<CustomerEntity> getClientes();

    //@RequestMapping(method = RequestMethod.GET, value = "${feign.cliente-resource}/{id}", produces = "application/json")
    CustomerEntity getCliente(@PathVariable("id") Long id);

    //@RequestMapping(method = RequestMethod.POST, value = "${feign.cliente-resource}")
    CustomerEntity create(@RequestBody CustomerEntity body);
}
