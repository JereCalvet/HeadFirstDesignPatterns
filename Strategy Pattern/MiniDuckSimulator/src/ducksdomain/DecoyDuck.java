package ducksdomain;

import encapsulatedflybehavior.FlyNoWay;
import encapsulatedquackbehavior.QuackInSilence;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackInSilence();
    }

    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
