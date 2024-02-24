package thirdweek;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number to check the factorial");
		int a = s.nextInt();
		for(int i=a;i>=1;i--) {
			f=f*i;
		}
		System.out.println("Factorial = "+f);

	}

}
