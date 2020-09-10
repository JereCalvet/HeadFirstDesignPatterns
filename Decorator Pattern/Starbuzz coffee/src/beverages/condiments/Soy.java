package beverages.condiments;

import beverages.Beverage;

public class Soy extends CondimentDecorator {

    protected Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }


    public Double cost() {
        return beverage.cost() + 0.15;
    }
}
