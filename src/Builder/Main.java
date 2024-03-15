package Builder;

public class Main {
    public static void main(String[] args) {
        //Problem 1
        System.out.println("Problem 1:");
        Pizza threeToppings = new PizzaBuilder().setPizzaSize("Large").addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms").createPizza();
        Pizza sixToppings = new PizzaBuilder().setPizzaSize("Medium").addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms").addTopping("Bacon").addTopping("Onions").addTopping("Extra Cheese").createPizza();
        Pizza nineToppings = new PizzaBuilder().setPizzaSize("Small").addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms").addTopping("Peppers").addTopping("Chicken").addTopping("Olives").addTopping("Spinach").addTopping("Tomato and Basil").addTopping("Beef").createPizza();

        threeToppings.eat();
        sixToppings.eat();
        nineToppings.eat();

        //Problem 2
        System.out.println("\n\nProblem 2:");

        Pizza largePizzaHut = new PizzaBuilder().setPizzaChain("Pizza Hut").setPizzaSize("Large").addTopping("Ham").addTopping("Pesto").addTopping("Chicken").createPizza();
        Pizza smallPizzaHut = new PizzaBuilder().setPizzaChain("Pizza Hut").setPizzaSize("Small").addTopping("Spicy Pork").addTopping("Ham and Pineapple").createPizza();

        Pizza mediumLittleCaesars = new PizzaBuilder().setPizzaSize("Medium").addTopping("Mushrooms").addTopping("Peppers").addTopping("Olives").addTopping("Peppers").addTopping("Spinach").addTopping("Onions").addTopping("Tomato and Basil").addTopping("Extra Cheese").createPizza();
        Pizza smallLittleCaesars = new PizzaBuilder().setPizzaSize("small").addTopping("Ham").addTopping("Sausage").addTopping("Bacon").addTopping("Spicy Pork").addTopping("Beef").addTopping("Extra Cheese").createPizza();

        Pizza smallDominos = new PizzaBuilder().setPizzaChain("Pizza Hut").setPizzaSize("Small").addTopping("Ham and Pineapple").createPizza();
        Pizza largeDominos = new PizzaBuilder().setPizzaChain("Pizza Hut").setPizzaSize("Large").addTopping("Ham").addTopping("Pesto").addTopping("Chicken").createPizza();

        largePizzaHut.eat();
        smallPizzaHut.eat();
        mediumLittleCaesars.eat();
        smallLittleCaesars.eat();
        smallDominos.eat();
        largeDominos.eat();
    }
}