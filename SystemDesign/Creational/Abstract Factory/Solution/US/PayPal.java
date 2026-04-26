package US;

import BaseInterface.PaymentGateway;

//concrete class
public class PayPal implements PaymentGateway {

    @Override
    public void processPayment(double amount){
        System.out.println("Payment Processed via PayPal of amount :$"+amount);
    }

}