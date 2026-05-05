package com.demo.payrollmanagementsystem.Implementation.Process;

import com.demo.payrollmanagementsystem.Interface.ProcessPayment;
import com.demo.payrollmanagementsystem.Model.Employe;
import com.demo.payrollmanagementsystem.Model.SalaryStructure;

public class IndiaProcessPayment implements ProcessPayment {

    private SalaryStructure salaryStructure;
    @Override
    public Double computePayment(Employe emp){

        salaryStructure = emp.getSalaryStructure();

        Double grossSalary=salaryStructure.getBaseSalary()+((emp.getWorkingDays()-emp.getLeaves())*salaryStructure.getdailyAllowance())+salaryStructure.getBonus();

        Double deductions=salaryStructure.getFoodDeductions()+salaryStructure.getPension()+salaryStructure.getTax();

        return Math.max(salaryStructure.getBaseSalary(),grossSalary-deductions);

    }
}
