package com.example.payment_api.service;

import com.example.payment_api.model.Payment;
import com.example.payment_api.model.PaymentRequest;
import com.example.payment_api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment processPayment(PaymentRequest request){

        Payment payment = new Payment();
        payment.setUserId(request.getUserId());
        payment.setAmount(request.getAmount());
        payment.setPaymentMethod(request.getPaymentMethod());

        payment.setStatus("SUCCESS");

        payment.setPaymentTime(LocalDateTime.now());

        return repository.save(payment);
    }
}
