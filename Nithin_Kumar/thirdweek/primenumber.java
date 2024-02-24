package thirdweek;

import java.util.Scanner;

public class primenumber {
	public static void main(String[]args) {
		Scanner s = new Scanner (System.in);
		int n;
		System.out.println("enter a number to check the given number is prime or not");
		n=s.nextInt();
		if(n%2==1) {
			System.out.println("The given number is prime number");
			
		}
		else {
			System.out.println("the given numbe is not a prime number");
		}
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				System.out.println(i);
				
			}
		}
	}

}
