package Assignments;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("enter two numbers to compare");
		a=s.nextInt();
		b=s.nextInt();
		if(a==b) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		

	}

}
