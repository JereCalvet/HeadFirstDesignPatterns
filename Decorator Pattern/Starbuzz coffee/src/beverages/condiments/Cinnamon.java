package beverages.condiments;

import beverages.Beverage;
import beverages.Size;

public class Cinnamon extends CondimentDecorator {

    public Cinnamon(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Cinnamon";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    private double cinnamonTax() {
        System.out.println("Cinnamon tax applied.");
        return 0.05;
    }

    public Double cost() {
        return beverage.cost() * (cinnamonTax() + 1);
    }
}
