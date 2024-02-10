import java.util.Scanner;
public class GoldPriceCalculator {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Gold rate per gram
		        double goldRate = 5250;

		        // Stone rate per piece
		        double stoneRate = 1500;

		        // Making charges
		        double makingCharges = 10;

		        System.out.println("Enter the weight of gold in grams:");
		        double goldWeight = scanner.nextDouble();

		        System.out.println("Enter the number of stones:");
		        int numberOfStones = scanner.nextInt();

		        // Calculate the price for gold
		        double goldPrice = goldWeight * goldRate;

		        // Calculate the price for stones
		        double stonesPrice = numberOfStones * stoneRate;

		        // Calculate the total price including making charges
		        double totalPrice = goldPrice + stonesPrice + makingCharges;

		        System.out.println("Total price for the gold including stones and making charges: " + totalPrice);

		        scanner.close();
		    }
		

	}


