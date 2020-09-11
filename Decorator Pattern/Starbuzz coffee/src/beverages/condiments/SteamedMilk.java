package beverages.condiments;

import beverages.Beverage;
import beverages.Size;

public class SteamedMilk extends CondimentDecorator {
    protected Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    public Double cost() {

        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += 0.10;
        } else if (getSize() == Size.GRANDE) {
            cost += 0.25;
        } else if (getSize() == Size.VENTI) {
            cost += 0.30;
        }

        return cost;
    }
}
