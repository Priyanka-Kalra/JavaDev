class CheckoutService1 {

    private final String gatewayType;

    public CheckoutService1(String gatewayType){
        this.gatewayType=gatewayType;
    }

    public void checkout(double amount){

        //process payment
        PaymentGateway payment;
        if(gatewayType.equals("razorpay"))payment=new RazorPay();
        else if(gatewayType.equals("payu"))payment=new PayU();
        else throw new IllegalArgumentException("No payment gateway found");

        payment.processPayment(amount);


        //generate invoice
        Invoice invoice=new GstInvoice();
        invoice.generateInvoice();
    }
}
