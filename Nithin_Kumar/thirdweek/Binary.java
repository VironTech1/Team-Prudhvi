package thirdweek;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        int originalNumber = decimalNumber;
        StringBuilder binaryRepresentation = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryRepresentation.insert(0, remainder);
            decimalNumber /= 2;
        }

        System.out.println("Binary representation of " + originalNumber + ": " + binaryRepresentation);
    }
}

