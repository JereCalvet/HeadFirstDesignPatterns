public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        System.out.println("Creating " + factory.createPizza("cheese"));
        System.out.println("Creating " + factory.createPizza("veggie"));
        System.out.println("Creating " + factory.createPizza("pepperoni"));
        System.out.println("Creating " + factory.createPizza("clam"));
    }
}
