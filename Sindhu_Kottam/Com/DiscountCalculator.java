package Com;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter MRP");
		int mrp=sc.nextInt();
		System.out.println("Enter % of Discount");
		int dis=sc.nextInt();
		int DiscountedPrice=mrp-(mrp*dis/100);
		System.out.println("Discounted Price is "+DiscountedPrice);

	}

}
