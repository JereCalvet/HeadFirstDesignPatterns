package beverages.condiments;

import beverages.Beverage;
import beverages.Size;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    public Double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += 0.20;
        } else if (getSize() == Size.GRANDE) {
            cost += 0.35;
        } else if (getSize() == Size.VENTI) {
            cost += 0.50;
        }

        return cost;
    }
}
