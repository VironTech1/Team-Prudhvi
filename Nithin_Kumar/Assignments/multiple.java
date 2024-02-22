package Assignments;

import java.util.Scanner;

public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("enter a number");
		Scanner s = new Scanner (System.in);
		a=s.nextInt();
		if(a%5==0) {
			System.out.println("the number is multiple of 5");
		}
		else {
			System.out.println("the number is not a multiple of 5");
		}

	}

}
