import pizzadomain.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaType) {
        return switch (pizzaType) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }
}
