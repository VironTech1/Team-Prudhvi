package Assignments;

import java.util.Scanner;

public class discount {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the original price and discount percentage (separated by space): ");
        double price = s.nextDouble();
        double percentage = s.nextDouble();

        double amount = price * (percentage / 100);
        double disc = price - amount;

        System.out.println("Original Price: $" + price);
        System.out.println("Discount Amount: $" + amount);
        System.out.println("Discounted Price: $" + disc);
    }

}
