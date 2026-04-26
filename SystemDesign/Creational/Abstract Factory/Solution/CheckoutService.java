import BaseInterface.*;
import Factories.*;


public class CheckoutService {

    private PaymentGateway payment;
    private Invoice invoice;
    private String gatewayType;

    public CheckoutService(RegionFactory factory,String gatewayType){

        this.payment= (PaymentGateway) factory.createPaymentGateway(gatewayType);
        this.gatewayType=gatewayType;
        this.invoice= (Invoice) factory.invoiceGenration();
    }

    public void completeOrder(double amount){
        payment.processPayment(amount);
        invoice.generateInvoice();
    }
}