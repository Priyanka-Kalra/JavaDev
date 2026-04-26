package Factories;
import BaseInterface.*;
import India.*;

public class IndiaFactory implements RegionFactory{

    public PaymentGateway createPaymentGateway(String gatewayType){
        if(gatewayType.equals("razorpay"))return new RazorPay();
        else if(gatewayType.equals("payu"))return new PayU();
        else throw new IllegalArgumentException("No payment gateway found");
    }

    public Invoice invoiceGenration(){
        return new GstInvoice();
    }
}
