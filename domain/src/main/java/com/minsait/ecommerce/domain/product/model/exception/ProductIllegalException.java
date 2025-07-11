package com.minsait.ecommerce.domain.product.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductIllegalException extends RuntimeException{
    private String errorMessage;
}
