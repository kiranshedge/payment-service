package com.rayedge.payment.controller;

import com.rayedge.payment.dto.PaymentRequest;
import com.rayedge.payment.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/authorize")
    public String authorizePayment(@RequestBody PaymentRequest request) {
        return paymentService.authorize(request);
    }
}