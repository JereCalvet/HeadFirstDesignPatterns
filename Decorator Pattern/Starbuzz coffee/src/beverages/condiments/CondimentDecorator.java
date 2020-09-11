package beverages.condiments;

import beverages.Beverage;
import beverages.Size;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();
    public abstract Size getSize();
}
