public class PayU {

    public void makePayment(String invoiceId,Double amount) {
        System.out.println("Payment successful for Order: "+invoiceId+" of amount: $."+amount+" via PayU");
    }
}
