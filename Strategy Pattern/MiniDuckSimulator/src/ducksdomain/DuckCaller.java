package ducksdomain;

// Brain power answer

import encapsulatedflybehavior.FlyBehavior;
import encapsulatedflybehavior.FlyRocketPowered;
import encapsulatedquackbehavior.Quack;
import encapsulatedquackbehavior.QuackBehavior;

public class DuckCaller {
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public DuckCaller() {
        quackBehavior = new Quack();
        flyBehavior = new FlyRocketPowered();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
