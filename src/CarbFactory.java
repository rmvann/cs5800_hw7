import java.util.ArrayList;
import java.util.Random;

public class CarbFactory {

    private static final CarbFactory instance = new CarbFactory();

    private CarbFactory() {}

    public static CarbFactory getInstance() {
        return instance;
    }

    public String makeCarb(Customer customer) {
        ArrayList<String> potential = new ArrayList<>();

        switch(customer.getDietPlan()) {
            case NO_RESTRICTION:
                potential.add("Cheese");
                potential.add("Bread");
                potential.add("Lentils");
                potential.add("Pistachio");
                break;
            case PALEO:
                potential.add("Pistachio");
                break;
            case VEGAN:
                potential.add("Bread");
                potential.add("Lentils");
                potential.add("Pistachio");
                break;
            case NUT_ALLERGY:
                potential.add("Cheese");
                potential.add("Bread");
                potential.add("Lentils");
                break;
        }

        Random rand = new Random();
        return potential.get(rand.nextInt(potential.size()));
    }
}
