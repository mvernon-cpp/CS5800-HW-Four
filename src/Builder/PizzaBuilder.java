package Builder;
import java.util.ArrayList;
public class PizzaBuilder {
    private String pizzaChain;
    private String pizzaSize;
    private ArrayList<String> pizzaToppings;

    public PizzaBuilder(){}
    public PizzaBuilder setPizzaChain(String pizzaChain)
    {
        this.pizzaChain = pizzaChain;
        return this;
    }

    public PizzaBuilder setPizzaSize(String pizzaSize)
    {
        this.pizzaSize = pizzaSize;
        return this;
    }

    public PizzaBuilder addTopping(String pizzaTopping)
    {
        if(pizzaToppings == null)
            pizzaToppings = new ArrayList<>();
        pizzaToppings.add(pizzaTopping);
        return this;
    }

    public Pizza createPizza()
    {
        return new Pizza(pizzaChain, pizzaSize, pizzaToppings);
    }
}
