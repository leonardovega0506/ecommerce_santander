package com.minsait.ecommerce.domain.customer.model.dto.command;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCreateCommand {

    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
}
