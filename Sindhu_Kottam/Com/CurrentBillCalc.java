package Com;

import java.util.Scanner;

public class CurrentBillCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units of current consumed!!");
		int units=sc.nextInt();
		int bill;
		if(units>0 && units<=100)
			bill=3;
		else if(units>100 && units<=200)
			bill=4;
		else if(units>200 && units<=300)
			bill=5;
		else 
			bill=6;
		
		System.out.println("Your Bill is "+bill);
	}

}
