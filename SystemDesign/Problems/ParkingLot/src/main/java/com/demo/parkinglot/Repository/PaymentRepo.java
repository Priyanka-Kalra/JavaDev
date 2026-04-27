package com.demo.parkinglot.Repository;

import com.demo.parkinglot.Model.Payment;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PaymentRepo {
    private Map<UUID,Payment> paymentDB=new ConcurrentHashMap<>();

    public void save(Payment payment) {
        paymentDB.put(payment.getPaymentId(), payment);
    }
}
