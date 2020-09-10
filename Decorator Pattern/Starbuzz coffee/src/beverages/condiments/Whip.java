package beverages.condiments;

import beverages.Beverage;

public class Whip extends CondimentDecorator {
    protected Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public Double cost() {
        return beverage.cost() + 0.10;
    }
}
