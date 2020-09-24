package multithread;

public class Main {
    public static void main(String[] args) {
        ChocolateBoilerSingleton boiler1 = ChocolateBoilerSingleton.getInstance();
        System.out.println("filling empty boiler");
        boiler1.fill();
        System.out.println("is boiler1 empty? " + boiler1.isEmpty());
        System.out.println("is boiler1 boiled? " + boiler1.isBoiled());

        ChocolateBoilerSingleton boiler2 = ChocolateBoilerSingleton.getInstance();
        System.out.println("boiling full boiler");
        boiler2.boil();
        System.out.println("is boiler2 empty? " + boiler2.isEmpty());
        System.out.println("is boiler2 boiled? " + boiler2.isBoiled());

        ChocolateBoilerSingleton boiler3 = ChocolateBoilerSingleton.getInstance();
        System.out.println("draining boiler");
        boiler3.drain();
        System.out.println("is boiler3 empty? " + boiler3.isEmpty());
        System.out.println("is boiler3 boiled? " + boiler3.isBoiled());
    }
}