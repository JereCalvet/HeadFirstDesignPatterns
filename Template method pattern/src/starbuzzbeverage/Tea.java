package starbuzzbeverage;

import java.util.Scanner;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    boolean customerWantsCondiments() {
        return getUserInput();
    }

    private boolean getUserInput() {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to lemon with your tea (y/n)? ");
        final String answer = scanner.nextLine().toLowerCase();

        return answer.startsWith("y");
    }
}
