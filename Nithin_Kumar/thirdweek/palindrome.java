package thirdweek;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n, r = 0, num;
		System.out.println("Enter a number to check it a palindrome or not");
		n=s.nextInt();
		num= n;
		while(n!=0) {
			int d = n%10;
			r =r*10+d;
			n=n/10;
		}
		if(num == r) {
			System.out.println("the given number is palindrome");
		}
		else
			System.out.println("the given number is not a palindrome");
		
	}

}
