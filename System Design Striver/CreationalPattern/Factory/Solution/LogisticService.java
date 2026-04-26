//service shldnt deal with logic of object creation
//here it is Single responsobility principle bcz its performing two tasks:
//1. object creating
//2. calling the methods/buisness logic
//also if we wanna add onw more mode say 'train' we would have to alter  this class, again ocp principle also violated, as we need to extend and not modify
public class LogisticService {

    public void send(String mode){

        Logistics logistic;
        if(mode=="Air"){
            logistic=new Air();
            logistic.send();
        }
        else if(mode=="Road"){
            logistic=new Road();
            logistic.send();
        }
        else System.out.println('Mode unidentified');
    }
}
