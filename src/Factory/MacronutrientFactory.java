package Factory;

import java.util.ArrayList;

public class MacronutrientFactory {
    private static MacronutrientFactory macronutrientFactory = null;

    private MacronutrientFactory(){}

    public static MacronutrientFactory getInstance(){
        if(macronutrientFactory == null)
            macronutrientFactory = new MacronutrientFactory();
        return macronutrientFactory;

    }

    public static Macronutrient getMacronutrients(String dietPlan) {
        switch (dietPlan){
            case "no restriction":
                return new NoRestriction();
            case "paleo":
                return new Paleo();
            case "vegan":
                return new Vegan();
            case "nut allergy":
                return new NutAllergy();
            default:
                return null;
        }
    }

public static ArrayList getBalancedMeal(String customerName, String dietPlan) {
    Macronutrient macros = getMacronutrients(dietPlan);

    ArrayList meal = macros.makeMeal(customerName, dietPlan);
    return meal;

}
}
