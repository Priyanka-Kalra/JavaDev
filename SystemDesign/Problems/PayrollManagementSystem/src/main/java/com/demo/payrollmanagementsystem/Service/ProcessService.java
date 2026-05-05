package com.demo.payrollmanagementsystem.Service;

import com.demo.payrollmanagementsystem.Enums.PaymentStatus;
import com.demo.payrollmanagementsystem.Factory.PaymentMethodFactory;
import com.demo.payrollmanagementsystem.Factory.ProcessPaymentFactory;
import com.demo.payrollmanagementsystem.Interface.PaymentMethod;
import com.demo.payrollmanagementsystem.Interface.ProcessPayment;
import com.demo.payrollmanagementsystem.Model.Employe;
import com.demo.payrollmanagementsystem.Model.PaySlip;
import com.demo.payrollmanagementsystem.Model.Payment;
import com.demo.payrollmanagementsystem.Repository.PaySlipRepo;
import com.demo.payrollmanagementsystem.Repository.PaymentRepo;

import java.util.List;

public class ProcessService {

    private ProcessPayment processPayment;
    private PaymentMethod paymentMethod;
    private ProcessPaymentFactory processPaymentFactory;
    private PaymentMethodFactory paymentMethodFactory;
    private PaymentRepo paymentRepo;
    private PaymentService paymentService;

    private PaySlipRepo paySlipRepo;
    private PaySlipService paySlipService;
    private EmployeService employeService;

    public ProcessService(EmployeService employeService) {

        processPaymentFactory = new ProcessPaymentFactory();
        paymentMethodFactory = new PaymentMethodFactory();
        paySlipRepo = new PaySlipRepo();
        paySlipService = new PaySlipService(paySlipRepo);
        paymentRepo = new PaymentRepo();
        paymentService = new PaymentService(paymentRepo);
    }

    public void processEmployess(List<Employe> employes) {

        for (Employe employe: employes) {

            //process payment
            processPayment=processPaymentFactory.generateProcessPayment(employe);
            paymentMethod=paymentMethodFactory.generatePaymentMethod(employe);

            //process payment
            Double netSalary=processPayment.computePayment(employe);

            //generate payslip
            PaySlip payslip=paySlipService.generatePaySlip(employe,paymentMethod,netSalary);

            //attempt payment
            Payment payment=paymentService.createPayment(payslip);
            boolean paymentStatus= paymentMethod.makePyament(payment);
            if(paymentStatus){
                paySlipService.updateStatus(payslip, PaymentStatus.SUCCESS);
                paymentService.updatePaymentStatus(payment,PaymentStatus.SUCCESS);
            }
            else{
                paySlipService.updateStatus(payslip, PaymentStatus.FAILURE);
                paymentService.updatePaymentStatus(payment,PaymentStatus.FAILURE);
            }
            //update payslip in records for future
            employeService.savePayslip(payslip);



        }
    }
}
