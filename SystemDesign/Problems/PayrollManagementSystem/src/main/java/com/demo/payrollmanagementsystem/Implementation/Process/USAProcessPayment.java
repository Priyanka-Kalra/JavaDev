package com.demo.payrollmanagementsystem.Implementation.Process;

import com.demo.payrollmanagementsystem.Interface.ProcessPayment;
import com.demo.payrollmanagementsystem.Model.Employe;

public class USAProcessPayment implements ProcessPayment {

    @Override
    public Double computePayment(Employe emp){

        //logic
        return 150.0;
    }
}
