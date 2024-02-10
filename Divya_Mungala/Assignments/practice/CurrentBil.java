package practice;
import java.util.Scanner;

public class CurrentBil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the consumed units: ");
        int consumedUnits = scanner.nextInt();

        double billAmount = 0;

        if (consumedUnits <= 100) {
            billAmount = consumedUnits * 3;
        } else if (consumedUnits <= 200) {
            billAmount = 100 * 3 + (consumedUnits - 100) * 4;
        } else if (consumedUnits <= 300) {
            billAmount = 100 * 3 + 100 * 4 + (consumedUnits - 200) * 5;
        } else {
            billAmount = 100 * 3 + 100 * 4 + 100 * 5 + (consumedUnits - 300) * 6;
        }

      
        System.out.println("The bill amount for " + consumedUnits + " units is: Rs. " + billAmount);

        scanner.close();

	}

}
