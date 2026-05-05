package com.demo.moviebooking.Factory;

import com.demo.moviebooking.Implementations.Card;
import com.demo.moviebooking.Implementations.UPI;
import com.demo.moviebooking.Interface.Payment;

public class PaymentFactory {

    private final String paymentType;
    public PaymentFactory(String paymentType) {
        this.paymentType= paymentType;
    }
    public Payment getPaymentMethod() {
        Payment payment = null;
        switch (paymentType) {
            case "Card":
                payment= new Card();
                break;
            default:
                payment= new UPI();
                break;
        }
        return payment;

    }
}
