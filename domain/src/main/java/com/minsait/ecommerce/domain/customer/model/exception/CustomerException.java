package com.minsait.ecommerce.domain.customer.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class CustomerException extends RuntimeException{

    private String errorMessage;
}
