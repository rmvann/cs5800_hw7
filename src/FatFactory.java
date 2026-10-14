import java.util.ArrayList;
import java.util.Random;

public class FatFactory {

    private static final FatFactory instance = new FatFactory();

    private FatFactory() {}

    public static FatFactory getInstance() {
        return instance;
    }

    public String makeFat(Customer customer) {
        ArrayList<String> potential = new ArrayList<>();

        switch(customer.getDietPlan()) {
            case NO_RESTRICTION:
                potential.add("Avocado");
                potential.add("Sour Cream");
                potential.add("Tuna");
                potential.add("Peanuts");
                break;
            case PALEO:
                potential.add("Avocado");
                potential.add("Tuna");
                potential.add("Peanuts");
                break;
            case VEGAN:
                potential.add("Avocado");
                potential.add("Peanuts");
                break;
            case NUT_ALLERGY:
                potential.add("Avocado");
                potential.add("Sour Cream");
                potential.add("Tuna");
                break;
        }

        Random rand = new Random();
        return potential.get(rand.nextInt(potential.size()));
    }
}
