package com.demo.payrollmanagementsystem.Model;

public class SalaryStructure {

    private Double baseSalary;
    private Double dailyAllowance;
    private Double bonus;
    private Double foodDeductions;
    private Double pension;
    private Double tax;

    public SalaryStructure(Double baseSalary, Double dailyAllowance, Double bonus, Double foodDeductions, Double pension, Double tax) {
        this.baseSalary = baseSalary;
        this.dailyAllowance = dailyAllowance;
        this.bonus = bonus;
        this.foodDeductions = foodDeductions;
        this.pension = pension;
        this.tax = tax;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getdailyAllowance() {
        return dailyAllowance;
    }

    public void setdailyAllowance(Double dailyAllowance) {
        this.dailyAllowance = dailyAllowance;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getFoodDeductions() {
        return foodDeductions;
    }

    public void setFoodDeductions(Double foodDeductions) {
        this.foodDeductions = foodDeductions;
    }

    public Double getPension() {
        return pension;
    }

    public void setPension(Double pension) {
        this.pension = pension;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
