package com.minsait.ecommerce.infraestructure.customer.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class CustomerErrorResponse {

    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
}
