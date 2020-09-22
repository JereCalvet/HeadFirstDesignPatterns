
import storedomain.*;
import pizzadomain.*;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyStylePizzaStore();
        PizzaStore chStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
