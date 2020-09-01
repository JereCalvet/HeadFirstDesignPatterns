package ducksdomain;

import encapsulatedflybehavior.FlyNoWay;
import encapsulatedquackbehavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
