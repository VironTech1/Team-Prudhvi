package Assignments.Jan23;

import java.util.Scanner;

public class Arithmeticoperations {

public static void main(String[] args) {
		
		System.out.println("enter two integer numbers a and b to perform arithmetic operations");
		
		Scanner sc= new Scanner(System.in);
		
		int a =sc.nextInt();
		
		int b =sc.nextInt();
		
		int sum = a+b;
		
		int div = a/b ;
		
		int sub = a-b ;
		
		int mul = a*b ;

		int rem = a%b ;


		System.out.println("Addition  of a and b is :" + sum);
		
		System.out.println("Subtraction  of a and b is :" + sub);
		
		System.out.println("Multiplication of a and b is :" + mul);
		
		System.out.println("Division of a and b is :" + div);
		
		System.out.println("remainder of a and b is :" + rem);



}
		
}
