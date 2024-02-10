package Assignments.Jan23;

import java.util.Scanner;

public class Divide {
	
public static void main(String[] args) {
		
		System.out.println("enter two integer numbers a and b to perform division");
		
		Scanner sc= new Scanner(System.in);
		
		int a =sc.nextInt();
		
		int b =sc.nextInt();
		
		int div = a/b;
		
		System.out.println("Sum of a and b is :" + div);
		
}
}
