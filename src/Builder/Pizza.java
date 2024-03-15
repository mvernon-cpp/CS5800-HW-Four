package Builder;

import java.util.ArrayList;

public class Pizza {
    private ArrayList<String> pizzaToppings;
    private String pizzaChain;
    private String pizzaSize;

    public Pizza(String pizzaChain, String pizzaSize, ArrayList<String> pizzaToppings)
    {
        this.pizzaChain = pizzaChain;
        this.pizzaSize = pizzaSize;
        this.pizzaToppings = pizzaToppings;
    }

    public void eat()
    {
        if(this.pizzaChain != null)
            System.out.println("Chain: " + pizzaChain);
        System.out.println("Size: " + pizzaSize + "\nToppings:");
        pizzaToppings.forEach((t) -> System.out.print(t + " "));
        System.out.println("\n================================");
    }
}
