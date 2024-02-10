import java.util.Scanner;

public class ReverseOfNumber {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a Number:");

        // Read the integer input provided by the user
        int number = scanner.nextInt();

        // Create a variable to store the reversed number
        int reversedNumber = 0;

        // Create a copy of the original number to preserve its value
        int originalNumber = number;

        // Start a while loop that continues until the number becomes 0
        while (number != 0) {
            // Multiply the reversedNumber by 10 and add the last digit of number
            reversedNumber = reversedNumber * 10 + number % 10;

            // Remove the last digit from number
            number /= 10;
        }

        // Print the originalNumber and its reversed counterpart
        System.out.println("The Reverse of " + originalNumber + " is " + reversedNumber);
    }
}

