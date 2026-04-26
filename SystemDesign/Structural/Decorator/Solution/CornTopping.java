// ============ Concrete Decorator: Adds Extra Corns ================
public class CornTopping extends PizzaDecorator {
    public CornTopping(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription(){
        return pizza.getDescription()+" Corn ";
    }

    @Override
    public double getCost(){
        return pizza.getCost()+19.00;
    }
}
