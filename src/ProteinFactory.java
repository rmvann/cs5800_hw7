import java.util.ArrayList;
import java.util.Random;

public class ProteinFactory {

    private static final ProteinFactory instance = new ProteinFactory();

    private ProteinFactory() {}

    public static ProteinFactory getInstance() {
        return instance;
    }

    public String makeProtein(Customer customer) {
        ArrayList<String> potential = new ArrayList<>();

        switch(customer.getDietPlan()) {
            case NUT_ALLERGY:
            case NO_RESTRICTION:
                potential.add("Fish");
                potential.add("Chicken");
                potential.add("Beef");
                potential.add("Tofu");
                break;
            case PALEO:
                potential.add("Fish");
                potential.add("Chicken");
                potential.add("Beef");
                break;
            case VEGAN:
                potential.add("Tofu");
                break;
        }

        Random rand = new Random();
        return potential.get(rand.nextInt(potential.size()));
    }
}
