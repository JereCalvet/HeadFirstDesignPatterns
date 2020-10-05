package duckdomain;

import turkeydomain.Turkey;

import java.util.Random;

public class DuckAdapter implements Turkey {
    private final Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        Random random = new Random();
        if (random.nextInt(5) + 1 == 5) {
            duck.fly();
        }
    }
}

