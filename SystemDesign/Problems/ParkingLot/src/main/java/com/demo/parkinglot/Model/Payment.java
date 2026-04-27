package com.demo.parkinglot.Model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {

    private UUID paymentId;
    private UUID ticketId;
    private Double totalFee;
    private PaymentGateway paymentGateway;
    private PaymentStatus paymentStatus;

    public enum PaymentGateway {
        RAZORPAY, PAYPAL
    }

    public enum PaymentStatus {
        PENDING, SUCCESS, FAILED
    }

    public Payment(UUID ticketId, Double totalFee, PaymentGateway paymentGateway) {
        this.paymentId = UUID.randomUUID();;
        this.ticketId = ticketId;
        this.totalFee = totalFee;
        this.paymentGateway = paymentGateway;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(UUID paymentId) {
        this.paymentId = paymentId;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public void setTicketId(UUID ticketId) {
        this.ticketId = ticketId;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    public PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
