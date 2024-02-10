import java.util.Scanner;
public class DiscountCalculator {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the original price:");
		        double originalPrice = scanner.nextDouble();

		        System.out.println("Enter the discount percentage:");
		        double discountPercentage = scanner.nextDouble();

		        double discountedPrice = calculateDiscount(originalPrice, discountPercentage);

		        System.out.println("Discounted Price: $" + discountedPrice);

		        scanner.close();
		    }

		    private static double calculateDiscount(double originalPrice, double discountPercentage) {
		        double discountAmount = (discountPercentage / 100) * originalPrice;
		        return originalPrice - discountAmount;
		    }


	}
