import duckdomain.Duck;
import duckdomain.DuckAdapter;
import duckdomain.MallardDuck;
import turkeydomain.Turkey;
import turkeydomain.TurkeyAdapter;
import turkeydomain.WildTurkey;

public class Main {

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Turkey duckAdapter = new DuckAdapter(duck);
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Calling duck: ");
        testDuck(duck);

        System.out.println("\nCalling duck: turkey using adapter");
        testDuck(turkeyAdapter);

        System.out.println("\nCalling turkey:  ");
        testTurkey(turkey);

        System.out.println("\nCalling turkey: duck using adapter");
        testTurkey(duckAdapter);
    }
}
