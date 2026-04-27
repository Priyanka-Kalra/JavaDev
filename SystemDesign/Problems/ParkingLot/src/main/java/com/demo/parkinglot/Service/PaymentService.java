package com.demo.parkinglot.Service;

import com.demo.parkinglot.Interface.PaymentMethodGateway;
import com.demo.parkinglot.Model.Payment;
import com.demo.parkinglot.Repository.PaymentRepo;

import java.util.UUID;

public class PaymentService {
    private PaymentRepo paymentRepo;
    public PaymentService(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    private boolean processPayment( Double amount, PaymentMethodGateway paymentMethodAdapter) {
        return paymentMethodAdapter.pay(amount);
    }
    public boolean paymentWithRetry(UUID ticketId, Double amount, PaymentMethodGateway paymentMethodAdapter, Payment.PaymentGateway paymentGateway,int maxRetries) {

        Payment payment=new Payment(ticketId,amount,paymentGateway);
        for(int i=0;i<maxRetries;i++){
            boolean success=processPayment(amount,paymentMethodAdapter);
            if(success) {
                payment.setPaymentStatus(Payment.PaymentStatus.SUCCESS);
                return true;
            }
        }
        payment.setPaymentStatus(Payment.PaymentStatus.FAILED);
        paymentRepo.save(payment);
        return false;


    }


}
