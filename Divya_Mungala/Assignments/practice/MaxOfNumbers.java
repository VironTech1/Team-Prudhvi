package practice;
import java.util.Scanner;
public class MaxOfNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
         
		  double max = num1;
		
			if(num2 > max){
			max = num2;
			}if (num3 > max) {
			max = num3;
			}
			System.out.println("Max of three numbers are : " + max);
			scanner.close();
			
		}
		
		
		
	}


