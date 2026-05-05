package com.demo.payrollmanagementsystem.Model;

import com.demo.payrollmanagementsystem.Enums.Country;
import com.demo.payrollmanagementsystem.Enums.EmployeCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Employe {

    private final UUID empId;
    private final String empName;
    private String department;
    private EmployeCategory employeCategory;
    private int workingDays;
    private int leaves;
    private Country country;
    private SalaryStructure salaryStructure;
    private BankDetails bankDetails;
    private List<PaySlip> paySlips;



    public Employe(String empName, String department, EmployeCategory employeCategory, int workingDays, int leaves, Country country, SalaryStructure salaryStructure, BankDetails bankDetails) {
        this.empId = UUID.randomUUID();
        this.empName = empName;
        this.department = department;
        this.employeCategory = employeCategory;
        this.workingDays = workingDays;
        this.leaves = leaves;
        this.country = country;
        this.salaryStructure = salaryStructure;
        this.bankDetails = bankDetails;
        this.paySlips = new ArrayList<>();
    }

    public UUID getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public EmployeCategory getEmployeCategory() {
        return employeCategory;
    }

    public void setEmployeCategory(EmployeCategory employeCategory) {
        this.employeCategory = employeCategory;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public SalaryStructure getSalaryStructure() {
        return salaryStructure;
    }

    public void setSalaryStructure(SalaryStructure salaryStructure) {
        this.salaryStructure = salaryStructure;
    }

    public BankDetails getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    public List<PaySlip> getPaySlips() {
        return paySlips;
    }

    public void setPaySlips(List<PaySlip> paySlips) {
        this.paySlips = paySlips;
    }
}
