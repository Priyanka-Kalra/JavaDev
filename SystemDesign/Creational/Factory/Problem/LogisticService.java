public class LogisticService {

    public void send(String mode){

        //buisness logic and object creation combined
        if(mode.equals("Air")){
            Logistics logistic=new Air();
            logistic.send();
        }
        else if(mode.equals("Road")){
            Logistics logistic=new Road();
            logistic.send();
        }

    }
}
