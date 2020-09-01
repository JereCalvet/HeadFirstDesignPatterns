package ducksdomain;

import encapsulatedflybehavior.FlyWithWings;
import encapsulatedquackbehavior.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real RedHead duck");
    }
}
