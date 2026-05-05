package com.demo.payrollmanagementsystem.Service;

import com.demo.payrollmanagementsystem.Enums.Country;
import com.demo.payrollmanagementsystem.Enums.EmployeCategory;
import com.demo.payrollmanagementsystem.Model.BankDetails;
import com.demo.payrollmanagementsystem.Model.Employe;
import com.demo.payrollmanagementsystem.Model.PaySlip;
import com.demo.payrollmanagementsystem.Model.SalaryStructure;
import com.demo.payrollmanagementsystem.Repository.EmployeRepo;

import java.util.List;
import java.util.Optional;

public class EmployeService {
    private EmployeRepo employeRepo;
    public EmployeService(EmployeRepo employeRepo) {
        this.employeRepo = employeRepo;
    }

    public Employe createUser(String name, String dept, EmployeCategory category, int workingDays, int leaves, Country country, SalaryStructure salaryStructure, BankDetails bankDetails) {
        Employe emp=new Employe(name,dept,category,workingDays,leaves,country,salaryStructure,bankDetails);
        employeRepo.save(emp);
        return emp;
    }

    public List<Employe> getAll() {
        return employeRepo.getAll();
    }

    public void savePayslip(PaySlip payslip) {
        Employe emp=payslip.getEmploye();
        employeRepo.addPayslip(emp,payslip);

    }
}
