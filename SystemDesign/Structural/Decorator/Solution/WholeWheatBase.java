//Concrete Base Pizza3
public class WholeWheatBase implements Pizza{

    @Override
    public String getDescription(){
        return "Whole Wheat Base ";
    }

    @Override
    public double getCost(){
        return 210.00;
    }
}
