package thirdweek;

import java.util.Scanner;

public class reverse {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n, r = 0;
		System.out.println("Enter a number to be reversed");
		n=s.nextInt();
		while(n!=0) {
			int d = n%10;
			r =r*10+d;
			n=n/10;
		}
		System.out.println("The reverse of the given number ="+r);
	}

}
