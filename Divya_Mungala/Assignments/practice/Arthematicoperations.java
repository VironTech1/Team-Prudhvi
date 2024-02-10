package practice;
import java.util.Scanner;

public class Arthematicoperations {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter the another number: ");
		
		double num2 = scanner.nextDouble();
		
		double sum = num1+num2;
		
		System.out.println("The sum of two numbers is : " + sum);
		
		double differences = num1-num2;
		
	    System.out.println("The difference of two numbers is : " + differences);
	  
		double multiplication = num1*num2;
		
		 System.out.println("The product of two numbers is : " + multiplication);
		  
		 if (num2 !=0) {
			 
		 double Remainder= num1/num2;
		 
		 System.out.println("The remainder of two numbers is : " + Remainder);
		 
		 } else {
			
		 
			 System.out.println("ERROR: Division by zero is undefined"); 
			 
		 }
		
	 }
	}
	

	


