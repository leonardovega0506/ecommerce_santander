package com.minsait.ecommerce.domain.customer.model.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class CustomerCreateCommand {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
}
