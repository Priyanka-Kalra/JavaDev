public class PauUAdaptorApi implements PaymentGateway{

    private PayU payU;
    public PauUAdaptorApi(){
        this.payU = new PayU();    }

    @Override
    public void pay(String orderId,Double amount) {
        payU.makePayment(orderId,amount);
    }
}
