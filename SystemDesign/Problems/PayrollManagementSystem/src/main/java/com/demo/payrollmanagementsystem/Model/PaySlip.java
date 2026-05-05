package com.demo.payrollmanagementsystem.Model;

import com.demo.payrollmanagementsystem.Enums.PaymentStatus;
import com.demo.payrollmanagementsystem.Interface.PaymentMethod;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.UUID;

public class PaySlip {

    private final UUID paySlipId;
    private final UUID employeId;
    private PaymentMethod paymentMethod;
    private Double netSalary;
    private PaymentStatus paymentStatus;
    private final Month month;

    public PaySlip(UUID employeId, PaymentMethod paymentMethod, Double netSalary) {
        this.paySlipId = UUID.randomUUID();
        this.employeId = employeId;
        this.paymentMethod = paymentMethod;
        this.netSalary = netSalary;
        this.paymentStatus = PaymentStatus.NOT_INITIALIZED;
        this.month = LocalDateTime.now().getMonth();
    }

    public Month getMonth() {
        return month;
    }
    public UUID getPaySlipId() {
        return paySlipId;
    }

    public UUID getEmployeId() {
        return employeId;
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
