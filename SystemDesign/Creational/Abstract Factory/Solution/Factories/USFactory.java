package Factories;

import BaseInterface.Invoice;
import BaseInterface.PaymentGateway;
import BaseInterface.RegionFactory;
import India.GstInvoice;
import India.PayU;
import India.RazorPay;
import US.PayPal;
import US.StateInvoice;
import US.Stripe;

public class USFactory implements RegionFactory{

    public PaymentGateway createPaymentGateway(String gatewayType){
        if(gatewayType.equals("paypal"))return new PayPal();
        else if(gatewayType.equals("stripe"))return new Stripe();
        else throw new IllegalArgumentException("No payment gateway found");
    }

    public Invoice invoiceGenration(){
        return new StateInvoice();
    }
}
