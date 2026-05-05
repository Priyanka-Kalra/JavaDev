package com.demo.payrollmanagementsystem.Model;

import com.demo.payrollmanagementsystem.Enums.PaymentStatus;
import com.demo.payrollmanagementsystem.Interface.PaymentMethod;

import java.util.UUID;

public class PaySlip {

    private final UUID paySlipId;
    private final Employe employe;
    private PaymentMethod paymentMethod;
    private Double netSalary;
    private PaymentStatus paymentStatus;

    public PaySlip(Employe employe, PaymentMethod paymentMethod, Double netSalary) {
        this.paySlipId = UUID.randomUUID();
        this.employe = employe;
        this.paymentMethod = paymentMethod;
        this.netSalary = netSalary;
        this.paymentStatus = PaymentStatus.NOT_INITIALIZED;
    }

    public UUID getPaySlipId() {
        return paySlipId;
    }

    public Employe getEmploye() {
        return employe;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getNetSalary() {
        return netSalary;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setNetSalary(Double netSalary) {
        this.netSalary = netSalary;
    }

}
