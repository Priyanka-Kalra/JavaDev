import Factories.IndiaFactory;
import Factories.USFactory;

public class Main{

    public static void main(String args[]){

        CheckoutService serviceIn =new CheckoutService(new IndiaFactory(),"payu");
        serviceIn.completeOrder(100);

        CheckoutService serviceUS =new CheckoutService(new USFactory(),"stripe");
        serviceUS.completeOrder(970);
    }
}