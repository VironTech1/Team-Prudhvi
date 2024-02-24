package Com;

import java.util.Scanner;

public class EmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter principle amount");
		double amt=sc.nextDouble();
		System.out.println("Enter ROI");
		Double rate=sc.nextDouble()/12/100;
		System.out.println("Enter Tenure in months");
		Double n=sc.nextDouble();
		double emi;
		
		emi=(amt*rate*Math.pow(1+rate, n))/(Math.pow(1+rate, n)-1);
		
		System.out.println("EMI is "+emi);
		
	}

}