public class PizzaDriver {
    public static void main(String[] args) {
        Pizza p1 = new Pizza.PizzaBuilder("Pizza Hut", "Small").pepperoni().sausage().onions().build();
        Pizza p2 = new Pizza.PizzaBuilder("Pizza Hut", "Medium").pepperoni().sausage().onions().peppers().
            olives().spinach().build();
        Pizza p3 = new Pizza.PizzaBuilder("Pizza Hut", "Large").pepperoni().sausage().onions().peppers().
                olives().spinach().pesto().bacon().chicken().build();

        p1.eat();
        p2.eat();
        p3.eat();

        Pizza p4 = new Pizza.PizzaBuilder("Pizza Hut", "Large").pepperoni().sausage().onions().build();
        Pizza p5 = new Pizza.PizzaBuilder("Pizza Hut", "Small").pepperoni().olives().build();

        Pizza p6 = new Pizza.PizzaBuilder("Little Caesars", "Medium").pepperoni().sausage().onions().peppers().
                olives().spinach().pesto().bacon().build();
        Pizza p7 = new Pizza.PizzaBuilder("Little Caesars", "Small").pepperoni().sausage().onions().peppers().
                olives().spinach().build();

        Pizza p8 = new Pizza.PizzaBuilder("Dominos", "Small").tomatoAndBasil().build();
        Pizza p9 = new Pizza.PizzaBuilder("Dominos", "Large").pepperoni().sausage().onions().build();

        p4.eat();
        p5.eat();
        p6.eat();
        p7.eat();
        p8.eat();
        p9.eat();

    }
}