import beverages.*;
import beverages.condiments.*;

import static beverages.Size.*;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getSize() + " " + beverage1.getDescription() + " $" + beverage1.cost() + "\n");

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getSize() + " " + beverage2.getDescription() + " $" + beverage2.cost() + "\n");

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Sugar(beverage3);
        //beverage3.setSize(Size.VENTI); calling it here won't work because decorator hasn't got setSize method
        System.out.println(beverage3.getSize() + " " + beverage3.getDescription() + " $" + beverage3.cost() + "\n");
        //sugar is added state (field in decorator)

        Beverage beverage4 = new Decaf();
        beverage4.setSize(GRANDE);
        beverage4 = new Soy(beverage4);
        beverage4 = new Cinnamon(beverage4); //applying example tax here.
        System.out.println(beverage4.getSize() + " " + beverage4.getDescription() + " $" + beverage4.cost() + "\n");
        //added behavior (private method Cinnamontax
    }
}
