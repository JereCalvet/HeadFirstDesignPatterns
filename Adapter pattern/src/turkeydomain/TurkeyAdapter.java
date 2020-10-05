package turkeydomain;

import duckdomain.Duck;
import turkeydomain.Turkey;

public class TurkeyAdapter implements Duck {
    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        int counter = 0;
        while (counter++ < 5) {
            turkey.fly();
        }
    }

}
