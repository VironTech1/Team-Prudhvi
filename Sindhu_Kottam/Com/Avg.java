package Com;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Enter third number");
		c=sc.nextInt();
		System.out.println("Average of three numbers is "+((a+b+c)/3));
	}

}
