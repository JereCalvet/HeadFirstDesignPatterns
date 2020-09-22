package storedomain;

import pizzadomain.*;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        return switch (pizzaType) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}
