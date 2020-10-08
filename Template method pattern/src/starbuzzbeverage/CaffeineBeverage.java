package starbuzzbeverage;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        printBeverageName();
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        System.out.println();
    }

    abstract void brew();

    abstract void addCondiments();

    boolean customerWantsCondiments() {
        return true;
    }

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void printBeverageName() {
        System.out.println("Making " + this.getClass().getSimpleName() + "...");
    }
}
