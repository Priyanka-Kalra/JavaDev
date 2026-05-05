package com.demo.payrollmanagementsystem.Repository;

import com.demo.payrollmanagementsystem.Model.Employe;
import com.demo.payrollmanagementsystem.Model.PaySlip;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeRepo {

    private Map<UUID,Employe> employeMap=new ConcurrentHashMap<>();

    public List<Employe> getAll() {
        return new ArrayList<>(employeMap.values());
    }

    public void save(Employe emp) {
        employeMap.put(emp.getEmpId(), emp);
    }

    public void addPayslip(Employe emp, PaySlip payslip) {
        List<PaySlip> paySlipList=emp.getSalarySlips();
        paySlipList.add(payslip);
        employeMap.put(emp.getEmpId(), emp);
    }
}
