public interface PaymentGateway {

    public void pay(String orderId,Double amount);
}
