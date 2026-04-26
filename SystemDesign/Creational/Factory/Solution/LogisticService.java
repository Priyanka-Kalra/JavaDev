public class LogisticService {

    public void send(String mode){

        //buisness logic(here) and object creation(factory) separated
        Logistics logistics=LogisticFactory.createLogistic(mode);
        logistics.send();
    }
}
