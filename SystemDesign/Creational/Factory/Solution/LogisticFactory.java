//creational Logic
public class LogisticFactory {

    public static Logistics createLogistic(String mode){

        if(mode.equals("Air"))return new Air();
        else if(mode.equals("Road"))return new Road();
        else throw new IllegalArgumentException("Not a valid mode");
    }
}
