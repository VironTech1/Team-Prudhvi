package practice;

import java.util.Scanner;

public class minOfThreeNumbers {

	public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
         
		  double min = num1;
		
			if(num2 < min){
			min = num2;
			}if (num3 < min) {
			min = num3;
			}
			System.out.println("minimum of three numbers are : " + min);
			scanner.close();
	}

}
