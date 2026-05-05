package com.demo.payrollmanagementsystem.Interface;

import com.demo.payrollmanagementsystem.Model.Employe;
import com.demo.payrollmanagementsystem.Model.Payment;

public interface PaymentMethod {

    public boolean makePyament(Payment payment);
}
