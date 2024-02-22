package InheritanceAssignment;

import java.util.Scanner;


public class MobileMain {
    public static void main(String[] args) {
        Mobile myMobile = new Mobile();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMobile Phone Controller Menu:");
            System.out.println("1. Recharge Balance");
            System.out.println("2. Make Call");
            System.out.println("3. Display Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter recharge amount: ");
                    double rechargeAmount = scanner.nextDouble();
                    myMobile.recharge(rechargeAmount);
                    break;
                case 2:
                    System.out.print("Enter cost per minute: ");
                    double costPerMinute = scanner.nextDouble();
                    System.out.print("Enter call duration in minutes: ");
                    int callMinutes = scanner.nextInt();
                    myMobile.makeCall(costPerMinute, callMinutes);
                    break;
                case 3:
                    myMobile.displayBalance();
                    break;
                case 0:
                    System.out.println("Exiting Mobile Phone Controller. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
