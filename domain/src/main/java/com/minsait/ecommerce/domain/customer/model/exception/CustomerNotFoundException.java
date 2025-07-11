package com.minsait.ecommerce.domain.customer.model.exception;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerNotFoundException extends RuntimeException{

    private  String errorMessage;
}
