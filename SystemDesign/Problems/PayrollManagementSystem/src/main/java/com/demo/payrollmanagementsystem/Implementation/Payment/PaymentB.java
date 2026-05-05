package com.demo.payrollmanagementsystem.Implementation.Payment;

import com.demo.payrollmanagementsystem.Interface.PaymentMethod;
import com.demo.payrollmanagementsystem.Model.Employe;
import com.demo.payrollmanagementsystem.Model.Payment;

public class PaymentB implements PaymentMethod {

    @Override
    public boolean makePyament(Payment payment) {

        //logic
        return true;
    }
}
