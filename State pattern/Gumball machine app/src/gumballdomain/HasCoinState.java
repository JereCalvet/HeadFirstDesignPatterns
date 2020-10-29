package gumballdomain;

import java.util.Random;

public class HasCoinState implements State {
    private final Random randomWinner;
    private GumballMachine gumballMachine;

    public HasCoinState(GumballMachine gumballMachine) {
        this.randomWinner = new Random(System.currentTimeMillis());
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You can't insert an other coin");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin returned");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getGumballCounter() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        return true;
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
