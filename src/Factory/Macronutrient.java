package Factory;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Macronutrient {
//    private ArrayList<String> carbs = new ArrayList<>(Arrays.asList("Cheese", "Bread", "Lentils", "Pistachio"));
//    private ArrayList<String> protein = new ArrayList<>(Arrays.asList("Fish", "Chicken", "Beef", "Avocado"));
//    private ArrayList<String> fats = new ArrayList<>(Arrays.asList("Avocado", "Sour Cream", "Tuna", "Peanuts"));
    abstract ArrayList<Macronutrient> makeMeal(String customerName, String dietPlan);

//    public ArrayList<String> getCarbs(){
//        return carbs;
//    }
//    public ArrayList<String> getProtein(){
//        return protein;
//    }
//    public ArrayList<String> getFats(){
//        return fats;
//    }
}
