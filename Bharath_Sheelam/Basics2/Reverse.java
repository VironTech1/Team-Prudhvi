package Assignment3;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter a number to be reversed: ");
            int num = scanner.nextInt();
            int reversed = 0;

            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 10;

            }
            System.out.println(reversed);
            System.out.println("Do you want to continue(yes/no)?");
            choice = scanner.next();
        } while (choice.equals("yes"));
        System.out.println("Exiting, thank you");
    }
}
