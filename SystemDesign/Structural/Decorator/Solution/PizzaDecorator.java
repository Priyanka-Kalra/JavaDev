// ======================== Abstract Decorator ===========================
// ====== Implements Pizza and holds a reference to a Pizza object =======
public abstract class PizzaDecorator implements Pizza{

    Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
}
