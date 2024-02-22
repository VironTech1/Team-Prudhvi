package Assignments.Jan23;

import java.util.Scanner;

public class Swap {

	
public static void main(String[] args) {
		
		System.out.println("enter two integer numbers a and b to perform swap");
		

		
		Scanner sc= new Scanner(System.in);
		
		int a =sc.nextInt();
		
		int b =sc.nextInt();
		
		System.out.println("Before swap of a and b is :" + a +"  and  "+ b);

		
		int temp = a;
		 
		 a =b;
		 
		 b= temp;
		
		
		
		System.out.println("After swap of a and b is :" +a+"  and  "+b);
		
}
}
