package Factory;

public class Main {
    public static void main(String[] args) {
        MacronutrientFactory m = MacronutrientFactory.getInstance();

        m.getBalancedMeal("John Doe", "no restriction");
        m.getBalancedMeal("Jane Doe", "no restriction");
        m.getBalancedMeal("Mr.Smith", "no restriction");
        m.getBalancedMeal("Mrs.Smith", "paleo");
        m.getBalancedMeal("Bob", "vegan");
        m.getBalancedMeal("Bobby", "nut allergy");
    }
}