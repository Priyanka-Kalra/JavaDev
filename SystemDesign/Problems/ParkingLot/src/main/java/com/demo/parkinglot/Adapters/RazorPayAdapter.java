package com.demo.parkinglot.Adapters;

import com.demo.parkinglot.Interface.PaymentMethodGateway;

public class RazorPayAdapter implements PaymentMethodGateway {
    @Override
    public boolean pay(Double amount) {
        System.out.println("Payment successful via RazorPay");
    }
}
