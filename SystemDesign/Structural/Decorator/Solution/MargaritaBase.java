//Concrete Base Pizza1
public class MargaritaBase implements Pizza {

    @Override
    public String getDescription(){
        return "Margarita ";
    }

    @Override
    public double getCost(){
        return 100.00;
    }
}
