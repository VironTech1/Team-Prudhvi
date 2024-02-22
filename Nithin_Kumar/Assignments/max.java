package Assignments;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any 3 numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}

	}

}
