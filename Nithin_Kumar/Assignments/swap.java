package Assignments;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the two numbers to swap");
		a=s.nextInt();
		b=s.nextInt();
		int temp = a;
		a=b;
		b=temp;
		System.out.println("a="+a+"\n"+"b="+b);
		
	}

}
