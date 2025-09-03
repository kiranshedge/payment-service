package com.rayedge.payment.service;

import com.rayedge.payment.dto.PaymentRequest;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PaymentService {

    private final Random random = new Random();

    public String authorize(PaymentRequest request) {
        // Check for invalid amount
        if (request.getAmount() <= 0) {
            return "FAILED: Invalid amount";
        }

        // Simulate checking user balance (here we randomly fail for demo)
        boolean sufficientBalance = random.nextInt(10) > 1; // 90% chance success
        if (!sufficientBalance) {
            return "FAILED: Insufficient balance";
        }

        // Simulate other possible checks like fraud detection, etc.
        boolean fraudCheck = random.nextInt(20) != 0; // 5% chance failure
        if (!fraudCheck) {
            return "FAILED: Fraud detected";
        }

        // If all checks pass
        return "OK: Payment authorized for reservation ID " + request.getReservationId();
    }
}
