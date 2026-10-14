public class MacronutrientMealFactory implements MealFactory {
    private static final MacronutrientMealFactory instance = new MacronutrientMealFactory();

    private MacronutrientMealFactory() {}

    public static MacronutrientMealFactory getInstance() {
        return instance;
    }

    @Override
    public Meal makeMeal(Customer customer) {
        String carb = CarbFactory.getInstance().makeCarb(customer);
        String protein = ProteinFactory.getInstance().makeProtein(customer);
        String fat = FatFactory.getInstance().makeFat(customer);
        return new Meal(carb, protein, fat);
    }
}
