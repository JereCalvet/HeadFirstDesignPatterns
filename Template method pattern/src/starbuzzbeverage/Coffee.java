package starbuzzbeverage;

import java.util.Scanner;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar");
    }

    @Override
    boolean customerWantsCondiments() {
        return getUserInput();
    }

    private boolean getUserInput() {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to add milk and sugar with your coffee (y/n)? ");
        final String answer = scanner.nextLine().toLowerCase();

        return answer.startsWith("y");
    }
}
