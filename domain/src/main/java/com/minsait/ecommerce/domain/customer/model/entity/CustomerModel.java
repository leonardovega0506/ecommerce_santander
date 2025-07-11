package com.minsait.ecommerce.domain.customer.model.entity;

import com.minsait.ecommerce.domain.customer.model.dto.command.CustomerCreateCommand;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "customer")
@ToString
public class CustomerModel{


    private CustomerEntityId id;
    private CustomerEntityName name;
    private CustomerEntityLastName lastName;
    private CustomerEntityEmail email;
    private CustomerEntityPhone phone;
    private CustomerEntityAddress address;

    public CustomerModel(Long id, String name, String lastName, String email, String phone, String address) {
        this.id= new CustomerEntityId(id);
        this.name= new CustomerEntityName(name);
        this.lastName = new CustomerEntityLastName(lastName);
        this.email = new CustomerEntityEmail(email);
        this.phone = new CustomerEntityPhone(phone);
        this.address = new CustomerEntityAddress(address);

    }


    public CustomerModel requestToCreate(CustomerCreateCommand customerCreateCommand){
        this.name = new CustomerEntityName(customerCreateCommand.getName());
        this.lastName = new CustomerEntityLastName(customerCreateCommand.getLastName());
        this.email = new CustomerEntityEmail(customerCreateCommand.getEmail());
        this.phone = new CustomerEntityPhone(customerCreateCommand.getPhone());
        this.address = new CustomerEntityAddress(customerCreateCommand.getAddress());

        return this;
    }
}
