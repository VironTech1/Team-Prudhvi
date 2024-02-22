package Assignments;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("enter a number ");
		Scanner c = new Scanner (System.in);
		a=c.nextInt();
		if(a%2==0) {
			System.out.println("the given number is even");
		}
		else if (a==0) {
			System.out.println("the given number is not even or odd");
		}
		else {
			System.out.println("the given number is odd");
		}

	}

}
