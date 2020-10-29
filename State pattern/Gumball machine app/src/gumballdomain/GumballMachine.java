package gumballdomain;

public class GumballMachine {
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    private State state;
    private int gumballCounter;

    public GumballMachine(int numberOfGumballs) {
        statesFactory();
        state = soldOutState;
        gumballCounter = numberOfGumballs;
        if (numberOfGumballs > 0) {
            state = noCoinState;
        }
    }

    private void statesFactory() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        if (state == soldState || state == winnerState) {
            state.dispense();
        }
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (gumballCounter != 0) {
            gumballCounter--;
        }
    }

    void refill(int amount) {
        this.gumballCounter = amount;
        state = noCoinState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(State noCoinState) {
        this.noCoinState = noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public void setHasCoinState(State hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public int getGumballCounter() {
        return gumballCounter;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2020");
        result.append("\nInventory: ").append(gumballCounter).append(" gumball");
        if (gumballCounter != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is ").append(state).append("\n");
        return result.toString();
    }
}
