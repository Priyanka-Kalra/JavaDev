package com.demo.payrollmanagementsystem.Implementation.Process;

import com.demo.payrollmanagementsystem.Interface.ProcessPayment;
import com.demo.payrollmanagementsystem.Model.Employe;

public class IndiaProcessPayment implements ProcessPayment {

    @Override
    public Double computePayment(Employe emp){
        return 100.0;
    }
}
