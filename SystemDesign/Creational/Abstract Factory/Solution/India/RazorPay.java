package India;
import BaseInterface.*;

//concrete class
public class RazorPay implements PaymentGateway {

    @Override
    public void processPayment(double amount){
        System.out.println("Payment Processed via RazorPay of amount :Rs."+amount);
    }

}