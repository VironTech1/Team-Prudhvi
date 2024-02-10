import java.util.Scanner;

public class Gold2 {
    public static void main(String[] args) {
        // Gold rate (rate for 1 gram)
        double goldRate = 5250.0 / 10.0; // 10 grams = 1 tula

        // Making charges
        double makingCharges = 18.0;

        // Stone rate
        double stoneRate = 1500.0;

        // Input: weight of Gold in grams
        System.out.println("Enter the weight of Gold in grams:");
        Scanner scanner = new Scanner(System.in);
        double weightGold = scanner.nextDouble();

        // Calculate the cost of gold without stones
        double costOfOnlyGold = (goldRate * weightGold) + makingCharges;

        // Output: Price of gold without stone cost included
        System.out.println("Price of Gold (No Stone Cost Included) with Handling: " + costOfOnlyGold);

        // Input: Choose whether to include stones (1 for Yes, 0 for No)
        System.out.println("Enter 1 for stones, 0 for no stones:");
        int stoneIncluded = scanner.nextInt();

        // Calculate and output total price based on the choice
        if (stoneIncluded == 1) {
            double stoneCost = stoneRate * weightGold;
            double totalPriceWithStone = costOfOnlyGold + stoneCost;
            System.out.println("Stone Cost: " + stoneCost);
            System.out.println("Total Price with Stone included: " + totalPriceWithStone);
        } else if (stoneIncluded == 0) {
            System.out.println("Price without Stone: " + costOfOnlyGold);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 0 for stone inclusion.");
        }
    }
}
