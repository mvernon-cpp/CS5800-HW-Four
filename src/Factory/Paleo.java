package Factory;
import java.util.ArrayList;
import java.util.Arrays;

public class Paleo extends Macronutrient {
    @Override
    ArrayList<Macronutrient> makeMeal(String customerName, String dietPlan)
    {
        ArrayList noRestrictionMeal = new ArrayList<>();
        ArrayList<String> carbs = new ArrayList<>(Arrays.asList("Pistachio"));
        ArrayList<String> proteins =new ArrayList<>(Arrays.asList("Fish", "Chicken", "Beef"));
        ArrayList<String> fats = new ArrayList<>(Arrays.asList("Avocado", "Tuna", "Peanuts"));

        String carb = carbs.get( (int)(Math.random() * carbs.size()) );
        String protein = proteins.get( (int)(Math.random() * proteins.size()) );
        String fat = fats.get( (int)(Math.random() * fats.size()) );

        noRestrictionMeal.add(carb);
        noRestrictionMeal.add(protein);
        noRestrictionMeal.add(fat);

        System.out.println("The " + dietPlan + " meal plan for " + customerName);
        for(Object food : noRestrictionMeal){
            System.out.print(food + " ");
        }

        System.out.println("\n-------------------");
        return noRestrictionMeal;
    }
}
