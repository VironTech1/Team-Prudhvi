package Assignments;

import java.util.Scanner;

public class calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File Size Converter");
        System.out.println("1. KB to MB");
        System.out.println("2. MB to KB");
        System.out.println("3. MB to GB");
        System.out.println("4. GB to MB");
        System.out.println("5. Exit");

        System.out.print("Enter your choice (1-5): ");
        int c = scanner.nextInt();

        double f;
        double co;

        switch (c) {
            case 1:
                System.out.print("Enter file size in KB: ");
                f = scanner.nextDouble();
                co = f / 1024; // 1 MB = 1024 KB
                System.out.println("File size in MB: " + co);
                break;
            case 2:
                System.out.print("Enter file size in MB: ");
                f = scanner.nextDouble();
                co = f * 1024; // 1 MB = 1024 KB
                System.out.println("File size in KB: " + co);
                break;
            case 3:
                System.out.print("Enter file size in MB: ");
                f = scanner.nextDouble();
                co = f / 1024; // 1 GB = 1024 MB
                System.out.println("File size in GB: " + co);
                break;
            case 4:
                System.out.print("Enter file size in GB: ");
                f = scanner.nextDouble();
                co = f * 1024; // 1 GB = 1024 MB
                System.out.println("File size in MB: " + co);
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }

        scanner.close();
    }
}


