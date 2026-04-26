//concrete class
class PayU implements PaymentGateway {

    @Override
    public void processPayment(double amount){
        System.out.println("Payment Processed via India.PayU of amount: "+amount);
    }

}