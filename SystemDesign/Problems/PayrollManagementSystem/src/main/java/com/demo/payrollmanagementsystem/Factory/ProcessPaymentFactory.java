package com.demo.payrollmanagementsystem.Factory;

import com.demo.payrollmanagementsystem.Implementation.Process.IndiaProcessPayment;
import com.demo.payrollmanagementsystem.Implementation.Process.USAProcessPayment;
import com.demo.payrollmanagementsystem.Interface.ProcessPayment;
import com.demo.payrollmanagementsystem.Model.Employe;

public class ProcessPaymentFactory {

    public ProcessPayment generateProcessPayment(Employe emp){

        if(emp.getCountry().equals("INDIA"))return new IndiaProcessPayment;
        else return new USAProcessPayment;
    }
}
