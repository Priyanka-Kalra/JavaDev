package US;

import BaseInterface.Invoice;

//concrete class
public class StateInvoice implements Invoice {

    @Override
    public void generateInvoice(){
        System.out.println("Country Invoice for US getting generated");
    }
}