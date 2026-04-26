//Concrete Base Pizza2
public class ChickenBase implements Pizza{

    @Override
    public String getDescription(){
        return "Chicken Base ";
    }

    @Override
    public double getCost(){
        return 180.00;
    }
}
