package gumballdomain;

public interface State {
    void insertCoin();
    void ejectCoin();
    boolean turnCrank();
    void dispense();
}
