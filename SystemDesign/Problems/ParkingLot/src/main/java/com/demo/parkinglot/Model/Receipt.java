package com.demo.parkinglot.Model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Receipt {

    private UUID receiptId;
    private UUID ticketId;
    private LocalDateTime exitTime;
    private Double totalFee;
    private PaymentStatus paymentStatus;

    public enum PaymentStatus { SUCCESS, PENDING,FAILURE};

    public Receipt( UUID ticketId, Double totalFee) {
        this.receiptId = UUID.randomUUID();
        this.ticketId = ticketId;
        this.exitTime = LocalDateTime.now();
        this.totalFee = totalFee;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public UUID getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(UUID receiptId) {
        this.receiptId = receiptId;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public void setTicketId(UUID ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
