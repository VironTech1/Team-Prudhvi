package practice;

import java.util.Scanner;

public class multipliedByFive {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("enter a new number: ");
		int num = Scanner.nextInt();
		
		if(num %5==0) 
		{
			System.out.println("Given number is multiplied by 3");
		}
		else 
		{
			System.out.println("Given number is not multiplied by 5");
		}
		
		}

	


	}


