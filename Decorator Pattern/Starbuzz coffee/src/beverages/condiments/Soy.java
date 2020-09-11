package beverages.condiments;

import beverages.Beverage;
import beverages.Size;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    public Double cost() {

        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += 0.15;
        } else if (getSize() == Size.GRANDE) {
            cost += 0.20;
        } else if (getSize() == Size.VENTI) {
            cost += 0.30;
        }

        return cost;
    }
}
