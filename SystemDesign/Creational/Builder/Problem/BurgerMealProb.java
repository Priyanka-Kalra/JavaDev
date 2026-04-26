import java.util.List;

//concrete class
class BurgerMealProb {

    private String bun;
    private String patty;
    private String sides;
    private List<String> toppings;

    public BurgerMealProb(String bun, String patty, String sides, List<String> toppings) {
        this.bun = bun;
        this.patty = patty;
        this.sides = sides;
        this.toppings = toppings;
    }

}