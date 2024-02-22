package Assignments.Jan23;

import java.util.Scanner;

public class Compare {
	
	
public static void main(String[] args) {
		
		System.out.println("enter two integer numbers a and b to perform comparision");
		

		
		Scanner sc= new Scanner(System.in);
		
		int a =sc.nextInt();
		
		int b =sc.nextInt();

		if (a==b) 
		{
			System.out.println("a  and b are equal");

		}
			else if(a>b)
		{
		System.out.println("a is greater");
		}
	    else 
		{
		System.out.println("b is greater");

		}
}
}