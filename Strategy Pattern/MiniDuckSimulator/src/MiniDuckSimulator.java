import ducksdomain.*;
import encapsulatedflybehavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern!! \n ");

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        System.out.println();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        System.out.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        System.out.println();

        DuckCaller duckCaller = new DuckCaller();
        System.out.println("This is a duck caller. No display method. Its not a duck");
        duckCaller.performQuack();
        duckCaller.performFly();
        System.out.println();
    }
}
