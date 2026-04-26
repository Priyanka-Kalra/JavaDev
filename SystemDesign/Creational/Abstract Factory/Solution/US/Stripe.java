package US;
import BaseInterface.PaymentGateway;

//concrete class
public class Stripe implements PaymentGateway {

    @Override
    public void processPayment(double amount){
        System.out.println("Payment Processed via Stripe of amount :$"+amount);
    }

}