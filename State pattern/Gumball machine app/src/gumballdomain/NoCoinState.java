package gumballdomain;

public class NoCoinState implements State {
    private GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You inserted a coin");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("You haven't inserted a coin");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned but there's no coin");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for quarter";
    }
}
