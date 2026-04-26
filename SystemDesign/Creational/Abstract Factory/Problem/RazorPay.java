//concrete class
class RazorPay implements PaymentGateway {

    @Override
    public void processPayment(double amount){
        System.out.println("Payment Processed via India.RazorPay of amount: "+amount);
    }

}