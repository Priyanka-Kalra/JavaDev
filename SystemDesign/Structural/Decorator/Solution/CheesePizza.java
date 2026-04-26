// ============ Concrete Decorator: Adds Extra Cheese ================
public class CheesePizza extends PizzaDecorator{

    public CheesePizza(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription(){
        return pizza.getDescription()+" Cheese ";
    }

    @Override
    public double getCost(){
        return pizza.getCost()+40.00;
    }

}
