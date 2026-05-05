package com.demo.payrollmanagementsystem.Model;

import com.demo.payrollmanagementsystem.Enums.PaymentStatus;

import java.util.UUID;

public class Payment {

    private final UUID paymentId;
    private final PaySlip paySlip;
    private PaymentStatus paymentStatus;

    public Payment(PaySlip paySlip) {
        this.paymentId = UUID.randomUUID();
        this.paySlip = paySlip;
        this.paymentStatus = paymentStatus;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public PaySlip getPaySlip() {
        return paySlip;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
