package com.example.payment_api.controller;

import com.example.payment_api.model.Payment;
import com.example.payment_api.model.PaymentRequest;
import com.example.payment_api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Payment makePayment(@RequestBody PaymentRequest paymentRequest){
        return paymentService.processPayment(paymentRequest);
    }
}
