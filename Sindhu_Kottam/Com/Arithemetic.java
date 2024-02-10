package Com;

import java.util.Scanner;

public class Arithemetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		String operation;
		System.out.println("Enter first number a:");
		a=sc.nextInt();
		System.out.println("Enter second number b:");
		b=sc.nextInt();
		System.out.println("Enter operation add,subtract,multiply,division,remainder");
		operation=sc.next();
		
		switch(operation) {
		case "add":System.out.println("Result after adding 2 numbers is "+(a+b));
		break;
		case "subtract":System.out.println("Result after subtracting 2 numbers is "+(a-b));
		break;
		case "multiply":System.out.println("Result after multiplication 2 numbers is "+(a*b));
		break;
		case "division":System.out.println("Result after division 2 numbers is "+(a/b));
		break;
		case "remainder":System.out.println("Result after modulo 2 numbers is "+(a%b));
		break;
		default:System.out.println("Incorrect operation specified!!");
		
		}

	}

}
