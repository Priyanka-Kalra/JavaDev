package BaseInterface;

import India.GstInvoice;
import India.PayU;
import India.RazorPay;

public interface RegionFactory {

    public PaymentGateway createPaymentGateway(String gatewayType);
    public Invoice invoiceGenration();
}
