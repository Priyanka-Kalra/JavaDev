import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{

    public static void main(String args[]){

        BurgerMeal burger=new BurgerMeal.BurgerMealBuilder("Garlic","Chicken").build();

//        BurgerMeal burgerWithCheese=new BurgerMeal.BurgerMealBuilder("Garlic","Chicken").withHasCheese(true).build();
        BurgerMeal.BurgerMealBuilder burgerBuilder=new BurgerMeal.BurgerMealBuilder("Garlic","Chicken");
        burgerBuilder=burgerBuilder.withHasCheese(true);
        BurgerMeal burgerWithCheese=burgerBuilder.build();
    }
}