package Assignments;

import java.util.Scanner;

public class currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.print("Enter your choice (1 or 2): ");
        int c = scanner.nextInt();
        
        double a;
        double r;
        
        switch (c) {
            case 1:
                System.out.print("Enter amount in USD: ");
                a = scanner.nextDouble();
                r = a* 74.17; // Assuming 1 USD = 74.17 INR (current exchange rate)
                System.out.println("Amount in INR: " + r);
                break;
            case 2:
                System.out.print("Enter amount in INR: ");
                a = scanner.nextDouble();
                r = a / 74.17; // Assuming 1 USD = 74.17 INR (current exchange rate)
                System.out.println("Amount in USD: " + r);
                break;
            default:
                System.out.println("Invalid choice! Please enter a number 1 or 2");
        }
        
        scanner.close();
    }
}
