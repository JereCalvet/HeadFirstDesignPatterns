package storedomain;

import pizzadomain.Pizza;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String pizzaType);

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza;

        pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
