package practice;
import java.util.Scanner;

public class GoldPrice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

       
        final double GoldRatePerGram = 5250;
        final double StoneRatePerStone = 1500;
        final double MakingChargesPercentage = 0.10; // 10%

        System.out.print("Enter the weight of gold in grams: ");
        double goldWeightInGrams = scanner.nextDouble();
        System.out.print("Enter the number of stones: ");
        int numberOfStones = scanner.nextInt();
      
      
        double goldPrice = goldWeightInGrams * GoldRatePerGram;
        double stonesPrice = numberOfStones * StoneRatePerStone;
        double totalWithoutMakingCharges = goldPrice + stonesPrice;
        double makingCharges = totalWithoutMakingCharges * MakingChargesPercentage;
        double totalPrice = totalWithoutMakingCharges + makingCharges;

       
        System.out.println("Gold price: Rs." + goldPrice);
        System.out.println("Stones price: Rs." + stonesPrice);
        System.out.println("Making charges: Rs." + makingCharges);
        System.out.println("Total price: Rs." + totalPrice);
        scanner.close();
	}

}
