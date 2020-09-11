package beverages.condiments;

import beverages.Beverage;
import beverages.Size;

public class Whip extends CondimentDecorator {
    protected Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    public Double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += 0.10;
        } else if (getSize() == Size.GRANDE) {
            cost += 0.15;
        } else if (getSize() == Size.VENTI) {
            cost += 0.20;
        }

        return cost;
    }
}
