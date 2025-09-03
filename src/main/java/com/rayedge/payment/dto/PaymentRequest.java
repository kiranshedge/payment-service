package com.rayedge.payment.dto;

import java.util.UUID;

public class PaymentRequest {
    private UUID reservationId;
    private double amount;

    public PaymentRequest() {}

    public PaymentRequest(UUID reservationId, double amount) {
        this.reservationId = reservationId;
        this.amount = amount;
    }

    public UUID getReservationId() {
        return reservationId;
    }

    public void setReservationId(UUID reservationId) {
        this.reservationId = reservationId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}