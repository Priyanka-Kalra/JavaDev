import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{

    public static void main(String args[]){
        List<String> toppings=new ArrayList<>(Arrays.asList("pickles","lettuce"));
        BurgerMealProb burger=new BurgerMealProb("Garlic bun","Chicken","Fries",toppings);

    }
}