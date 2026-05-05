package com.demo.payrollmanagementsystem.Factory;

import com.demo.payrollmanagementsystem.Implementation.Payment.PaymentA;
import com.demo.payrollmanagementsystem.Implementation.Payment.PaymentB;
import com.demo.payrollmanagementsystem.Implementation.Process.IndiaProcessPayment;
import com.demo.payrollmanagementsystem.Implementation.Process.USAProcessPayment;
import com.demo.payrollmanagementsystem.Interface.PaymentMethod;
import com.demo.payrollmanagementsystem.Interface.ProcessPayment;
import com.demo.payrollmanagementsystem.Model.Employe;

public class PaymentMethodFactory {

    public PaymentMethod generatePaymentMethod(Employe emp){

        if(emp.getCountry().equals("INDIA"))return new PaymentA();
        else return new PaymentB();
    }
}
