public class MacronutrientDriver {
    public static void main(String[] args) {
        Customer c1 = new Customer("Joel", Customer.DietPlan.NO_RESTRICTION);
        Customer c2 = new Customer("Carla", Customer.DietPlan.PALEO);
        Customer c3 = new Customer("Andy", Customer.DietPlan.VEGAN);
        Customer c4 = new Customer("Ralph", Customer.DietPlan.NUT_ALLERGY);
        Customer c5 = new Customer("Emily", Customer.DietPlan.NO_RESTRICTION);
        Customer c6 = new Customer("Jane", Customer.DietPlan.VEGAN);

        MealFactory fact = MacronutrientMealFactory.getInstance();

        Meal m1 = fact.makeMeal(c1);
        System.out.print(c1.getName() + " ");
        m1.eat();

        Meal m2 = fact.makeMeal(c2);
        System.out.print(c2.getName() + " ");
        m2.eat();

        Meal m3 = fact.makeMeal(c3);
        System.out.print(c3.getName() + " ");
        m3.eat();

        Meal m4 = fact.makeMeal(c4);
        System.out.print(c4.getName() + " ");
        m4.eat();

        Meal m5 = fact.makeMeal(c5);
        System.out.print(c5.getName() + " ");
        m5.eat();

        Meal m6 = fact.makeMeal(c6);
        System.out.print(c6.getName() + " ");
        m6.eat();
    }
}
