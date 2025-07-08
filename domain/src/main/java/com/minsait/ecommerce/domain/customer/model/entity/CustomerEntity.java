package com.minsait.ecommerce.domain.customer.model.entity;

import com.minsait.ecommerce.domain.customer.model.dto.command.CustomerCreateCommand;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;

    public CustomerEntity requestToCreate(CustomerCreateCommand clienteCreateCommand){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        return this;
    }
}
