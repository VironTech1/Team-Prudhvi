package InheritanceAssignment;

import java.util.Scanner;

public class TvMain extends Tv{
    public static void main(String[] args) {
        Tv myTV = new Tv();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nTV Controller Menu:");
            System.out.println("1. Increase Channel");
            System.out.println("2. Decrease Channel");
            System.out.println("3. Increase Volume");
            System.out.println("4. Decrease Volume");
            System.out.println("5. Display Status");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myTV.increaseChannel();
                    break;
                case 2:
                    myTV.decreaseChannel();
                    break;
                case 3:
                    myTV.increaseVolume();
                    break;
                case 4:
                    myTV.decreaseVolume();
                    break;
                case 5:
                    myTV.displayStatus();
                    break;
                case 0:
                    System.out.println("Exiting TV Controller. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}