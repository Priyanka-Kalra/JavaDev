package India;
import BaseInterface.*;

//concrete class
public class GstInvoice implements Invoice {

    @Override
    public void generateInvoice(){
        System.out.println("GST Invoice for India getting generated");
    }
}