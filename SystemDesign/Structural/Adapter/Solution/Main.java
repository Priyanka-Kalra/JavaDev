public class Main{

    public static void main(String args[]){

        PaymentService paymentService1=new PaymentService(new RazorPay());
        paymentService1.checkOut("QWER1",890.0);

        PaymentService paymentService2=new PaymentService(new PauUAdaptorApi());
        paymentService2.checkOut("QWER2",800.0);


    }
}