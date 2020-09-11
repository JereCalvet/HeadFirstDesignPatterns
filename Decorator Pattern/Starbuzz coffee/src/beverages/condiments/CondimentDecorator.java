package beverages.condiments;

import beverages.Beverage;
import beverages.Size;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    public abstract Size getSize();
}
