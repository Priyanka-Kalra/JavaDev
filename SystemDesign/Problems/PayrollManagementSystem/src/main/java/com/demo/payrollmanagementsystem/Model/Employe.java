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
    private double baseSalary;
    private List<PaySlip> salarySlips;
    private String bankDetails;
    private EmployeCategory employeCategory;
    private int workingDays;
    private int leaves;
    private Country country;

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

    public Employe(String empName, String department, double baseSalary, String bankDetails, EmployeCategory employeCategory, int workingDays, int leaves, Country country) {
        this.empId = UUID.randomUUID();
        this.empName = empName;
        this.department = department;
        this.baseSalary = baseSalary;
        this.salarySlips = new ArrayList<>();
        this.bankDetails = bankDetails;
        this.employeCategory = employeCategory;
        this.workingDays = workingDays;
        this.leaves = leaves;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public EmployeCategory getEmployeCategory() {
        return employeCategory;
    }

    public void setEmployeCategory(EmployeCategory employeCategory) {
        this.employeCategory = employeCategory;
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<PaySlip> getSalarySlips() {
        return salarySlips;
    }

    public void setSalarySlips(List<PaySlip> salarySlips) {
        this.salarySlips = salarySlips;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }
}
