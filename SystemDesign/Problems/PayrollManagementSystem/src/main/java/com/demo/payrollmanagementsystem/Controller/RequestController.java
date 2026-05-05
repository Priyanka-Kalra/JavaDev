package com.demo.payrollmanagementsystem.Controller;

import com.demo.payrollmanagementsystem.Enums.Country;
import com.demo.payrollmanagementsystem.Enums.EmployeCategory;
import com.demo.payrollmanagementsystem.Model.Employe;
import com.demo.payrollmanagementsystem.PayrollManagementSystemApplication;
import com.demo.payrollmanagementsystem.Repository.EmployeRepo;
import com.demo.payrollmanagementsystem.Repository.PaymentMethodRepo;
import com.demo.payrollmanagementsystem.Repository.ProcessPaymentRepo;
import com.demo.payrollmanagementsystem.Service.EmployeService;
import com.demo.payrollmanagementsystem.Service.PaymentMethodService;
import com.demo.payrollmanagementsystem.Service.ProcessPaymentService;
import com.demo.payrollmanagementsystem.Service.ProcessService;
import org.springframework.boot.SpringApplication;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RequestController {
    EmployeRepo employeRepo;
    EmployeService employeService;
    ProcessService processService;

    ProcessPaymentRepo processPaymentRepo;
//    ProcessPaymentService processPaymentService;
    PaymentMethodRepo paymentMethodRepo
//    PaymentMethodService paymentMethodServiceService;
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    public RequestController(){
        employeRepo = new EmployeRepo();
        employeService = new EmployeService(employeRepo);
        processPaymentRepo = new ProcessPaymentRepo();
        paymentMethodRepo = new PaymentMethodRepo();
//        processPaymentService = new ProcessPaymentService(processPaymentRepo);
//        paymentMethodServiceService=new PaymentMethodService(paymentMethodRepo);

//        processService = new ProcessService(paymentMethodServiceService,processPaymentService);
        processService = new ProcessService(employeService);
        scheduledExecutorService.scheduleAtFixedRate(this::paymentSchedule,0,30, TimeUnit.DAYS);
    }
    public void paymentSchedule(){

        try{
            Optional<List<Employe>> employes= Optional.ofNullable(employeService.getAll());

            if(employes.isEmpty())throw new Exception("No employees found");
            processService.processEmployess(employes.get());
        }
        catch(Exception e){
            System.out.println("Exception Occured : "+e.getMessage());
        }


    }
    public void main(String[] args) {

        SpringApplication.run(PayrollManagementSystemApplication.class, args);



        //create employee
        Employe emp=employeService.createUser("Priyanka","VAS",70000,"qwertyu", EmployeCategory.FTE,0,0, Country.INDIA);




    }
}
