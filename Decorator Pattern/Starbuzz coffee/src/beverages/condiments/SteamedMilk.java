package beverages.condiments;

import beverages.Beverage;

public class SteamedMilk extends CondimentDecorator {
    protected Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public Double cost() {
        return beverage.cost() + 0.10;
    }
}
