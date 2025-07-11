package com.minsait.ecommerce.domain.customer.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
}
