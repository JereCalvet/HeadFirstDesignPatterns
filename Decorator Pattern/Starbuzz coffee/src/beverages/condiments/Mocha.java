package beverages.condiments;

import beverages.Beverage;

public class Mocha extends CondimentDecorator {

    protected Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }


    public Double cost() {
        return beverage.cost() + 0.20;
    }
}
