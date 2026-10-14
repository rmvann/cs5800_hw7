public class Meal {
    private String carb;
    private String protein;
    private String fat;

    public Meal(String carb, String protein, String fat){
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public void eat(){
        System.out.println("Eating meal:");
        System.out.print("carb: " + carb);
        System.out.print(", protein: " + protein);
        System.out.println(", fat: " + fat);
    }
}
