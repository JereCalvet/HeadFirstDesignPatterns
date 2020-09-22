package storedomain;

import pizzadomain.*;

public class NyStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String pizzaType) {
        return switch (pizzaType) {
            case "cheese" -> new NyStyleCheesePizza();
            case "veggie" -> new NyStyleVeggiePizza();
            case "clam" -> new NyStyleClamPizza();
            case "pepperoni" -> new NyStylePepperoniPizza();
            default -> null;
        };
    }
}
