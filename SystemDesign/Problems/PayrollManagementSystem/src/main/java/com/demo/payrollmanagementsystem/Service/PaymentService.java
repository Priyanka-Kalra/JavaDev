package com.demo.payrollmanagementsystem.Service;

import com.demo.payrollmanagementsystem.Enums.PaymentStatus;
import com.demo.payrollmanagementsystem.Model.PaySlip;
import com.demo.payrollmanagementsystem.Model.Payment;
import com.demo.payrollmanagementsystem.Repository.PaymentRepo;

public class PaymentService {

    private PaymentRepo paymentRepo;

    public PaymentService(PaymentRepo paymentRepo) {
        this.paymentRepo=paymentRepo;
    }

    public Payment createPayment(PaySlip payslip) {
        Payment payment=new Payment(payslip);
        paymentRepo.save(payment);
        return payment;
    }

    public void updatePaymentStatus(Payment payment, PaymentStatus paymentStatus) {
        payment.setPaymentStatus(paymentStatus);
        paymentRepo.save(payment);
    }
}
