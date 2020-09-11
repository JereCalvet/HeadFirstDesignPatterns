package beverages.condiments;

import beverages.Beverage;
import beverages.Size;

public class Sugar extends CondimentDecorator {
    private int amountOfSugar; //added property

    public Sugar(Beverage beverage) {
        super(beverage);
        amountOfSugar = 3;
    }

    public String getDescription() {
        return beverage.getDescription() + ", " + amountOfSugar + " Sugar";
    }

    public Size getSize() {
        return beverage.getSize();
    }

    public Double cost() {
        return beverage.cost() + 0.1;
    }
}
