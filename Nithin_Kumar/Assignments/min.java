package Assignments;

import java.util.Scanner;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any 3 numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a<b && a<c) {
			System.out.println("a is least");
		}
		else if(b<a && b<c) {
			System.out.println("b is least");
		}
		else {
			System.out.println("c is least");
		}

	}

}
