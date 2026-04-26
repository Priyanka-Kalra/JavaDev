import java.util.List;

//concrete class
class BurgerMeal {

    //Mandatory
    private final String bun;
    private final  String patty;

    //Optional
    private final String sides;
    private final List<String> toppings;
    private final boolean hasCheese;

    public BurgerMeal(BurgerMealBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.sides = builder.sides;
        this.toppings = builder.toppings;
        this.hasCheese = builder.hasCheese;
    }

    public static class BurgerMealBuilder{
        //Mandatory
        private final String bun;
        private final  String patty;

        //Optional
        private String sides;
        private List<String> toppings;
        private boolean hasCheese;

        public BurgerMealBuilder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        public BurgerMealBuilder withSides(String sides) {
            this.sides=sides;
            return this;
        }
        public BurgerMealBuilder withToppings(List<String> toppings) {
            this.toppings = toppings == null
                    ? List.of()
                    : List.copyOf(toppings);
            return this;
        }
        public BurgerMealBuilder withHasCheese(boolean hasCheese) {
            this.hasCheese=hasCheese;
            return this;
        }

        public BurgerMeal build(){
            return new BurgerMeal(this);
        }

    }

}