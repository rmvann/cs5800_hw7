import java.util.ArrayList;

public class Pizza {
    private String chain;
    private String size;
    private ArrayList<String> toppings;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.chain = pizzaBuilder.chain;
        this.size = pizzaBuilder.size;
        this.toppings = new ArrayList<String>(pizzaBuilder.toppings);
    }

    public void eat(){
        System.out.println("Eating pizza:");
        System.out.println(this.chain);
        System.out.println(this.size);
        System.out.println(this.toppings);
    }

    public static class PizzaBuilder {
        private String chain;
        private String size;
        private ArrayList<String> toppings = new ArrayList<>();

        public PizzaBuilder(String chain, String size) {
            this.chain = chain;
            this.size = size;
        }

        public PizzaBuilder pepperoni() {
            toppings.add("Pepperoni");
            return this;
        }

        public PizzaBuilder sausage() {
            toppings.add("Sausage");
            return this;
        }

        public PizzaBuilder mushrooms() {
            toppings.add("Mushrooms");
            return this;
        }

        public PizzaBuilder bacon() {
            toppings.add("Bacon");
            return this;
        }

        public PizzaBuilder onions() {
            toppings.add("Onions");
            return this;
        }

        public PizzaBuilder extraCheese() {
            toppings.add("Extra Cheese");
            return this;
        }

        public PizzaBuilder peppers() {
            toppings.add("Peppers");
            return this;
        }

        public PizzaBuilder chicken() {
            toppings.add("Chicken");
            return this;
        }

        public PizzaBuilder olives() {
            toppings.add("Olives");
            return this;
        }

        public PizzaBuilder spinach() {
            toppings.add("Spinach");
            return this;
        }

        public PizzaBuilder tomatoAndBasil() {
            toppings.add("Tomato and Basil");
            return this;
        }

        public PizzaBuilder beef() {
            toppings.add("Beef");
            return this;
        }

        public PizzaBuilder ham() {
            toppings.add("Ham");
            return this;
        }

        public PizzaBuilder pesto() {
            toppings.add("Pesto");
            return this;
        }

        public PizzaBuilder spicyPork() {
            toppings.add("Spicy Pork");
            return this;
        }

        public PizzaBuilder hamAndPineapple() {
            toppings.add("Ham and Pineapple");
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }
}