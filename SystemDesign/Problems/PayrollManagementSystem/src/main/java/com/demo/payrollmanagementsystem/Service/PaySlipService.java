package com.demo.payrollmanagementsystem.Service;

import com.demo.payrollmanagementsystem.Enums.PaymentStatus;
import com.demo.payrollmanagementsystem.Interface.PaymentMethod;
import com.demo.payrollmanagementsystem.Model.Employe;
import com.demo.payrollmanagementsystem.Model.PaySlip;
import com.demo.payrollmanagementsystem.Repository.PaySlipRepo;

public class PaySlipService {
    private PaySlipRepo paySlipRepo;
    public PaySlipService(PaySlipRepo paySlipRepo) {
        this.paySlipRepo = paySlipRepo;
    }

    public PaySlip generatePaySlip(Employe employe, PaymentMethod paymentMethod, Double netSalary) {
        PaySlip paySlip = new PaySlip(employe.getEmpId(), paymentMethod, netSalary);
        paySlipRepo.save(paySlip);
        return paySlip;

    }

    public void updateStatus(PaySlip payslip, PaymentStatus paymentStatus) {
        payslip.setPaymentStatus(paymentStatus);
        paySlipRepo.save(payslip);
    }
}
