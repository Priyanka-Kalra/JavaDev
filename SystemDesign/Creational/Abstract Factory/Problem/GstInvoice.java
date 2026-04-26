//concrete class
class GstInvoice implements Invoice {

    @Override
    public void generateInvoice(){
        System.out.println("GST BaseInterface.Invoice for India getting generated");
    }
}