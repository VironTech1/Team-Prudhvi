package practice;

import java.util.Scanner;

public class DiscountPrice {

	public static void main(String[] args) {
		
	     Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the Origianal price: ");
			double OriginalPrice= scanner.nextDouble();
			
			System.out.println("Enter the DiscountRate: ");
			double DiscountRate = scanner.nextDouble();
			
			double DiscountAmount = OriginalPrice * (DiscountRate/100);
			double DiscountPrice = OriginalPrice - DiscountAmount;
			
			System.out.println("The DiscountAmount is: "+DiscountAmount);
			
			System.out.println("The DiscountPrice is: "+DiscountPrice);
			
			scanner.close();

	}

}
