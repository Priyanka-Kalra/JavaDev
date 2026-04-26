cpublic class PaymentService  {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public void checkOut(String orderId, Double amount){
        paymentGateway.pay(orderId,amount);
    }
}
