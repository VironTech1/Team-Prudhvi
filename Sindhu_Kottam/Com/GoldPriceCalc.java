package Com;

import java.util.Scanner;

public class GoldPriceCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gold weight in grams");
		double gweight=sc.nextDouble();
		System.out.println("Enter number of stones");
		int stone=sc.nextInt();
		System.out.println("Enter % of making charge(10-18)");
		int making=sc.nextInt();
		
		double EffPrice=gweight*5250+stone*1500;
		double MakingEffPrice=EffPrice+EffPrice*(making/100.0);
		
		System.out.println("Total price of the ornament is "+MakingEffPrice);
		
		

	}

}
