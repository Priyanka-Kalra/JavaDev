public class RazorPay implements PaymentGateway{
    @Override
    public void pay(String orderId,Double amount) {
        System.out.println("Payment successful for Order: "+orderId+" of amount: Rs."+amount+" via RazorPay");
    }
}
