public class Main{

    public static void main(String args[]){

        PaymentService paymentService=new PaymentService(new RazorPay());
        paymentService.checkOut("QWER1",890.0);

        PayU payU=new PayU();
        payU.makePayment("QWER2",890.0);


    }
}