package com.demo.payrollmanagementsystem.Repository;

import com.demo.payrollmanagementsystem.Model.Payment;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PaymentRepo {

    private Map<UUID,Payment> paymentRepo=new ConcurrentHashMap<>();

    public void save(Payment payment) {
        paymentRepo.put(payment.getPaymentId(), payment);
    }
}
