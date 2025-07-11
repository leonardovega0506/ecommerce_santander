package com.minsait.ecommerce.domain.customer.model.exception;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInputException extends RuntimeException{

    private String errorMessage;
}
