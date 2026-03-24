package com.example.payment_api.model;

import lombok.Data;

@Data
public class PaymentRequest {

    private String userId;
    private Double amount;
    private String paymentMethod;
}
