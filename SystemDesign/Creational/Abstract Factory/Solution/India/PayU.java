package India;
import BaseInterface.*;

//concrete class
public class PayU implements PaymentGateway {

    @Override
    public void processPayment(double amount){
        System.out.println("Payment Processed via PayU of amount :Rs."+amount);
    }

}