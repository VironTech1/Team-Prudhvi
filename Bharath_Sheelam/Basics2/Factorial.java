package Assignment3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice;

        do {
            System.out.println("Enter a number to find its factorial: ");
            int i = scanner.nextInt();
            int factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }

            System.out.println("Factorial: " + factorial);

            System.out.println("Do you want to continue? (yes/no): ");
            choice = scanner.next();
        } while (choice.equals("yes"));

        System.out.println("Exiting program, thank you");
        scanner.close();
    }
}
