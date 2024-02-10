package practice;
import java.util.Scanner;

public class comparingnumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println( " enthe the first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.println( " enthe the second number: ");
		double num2 = scanner.nextDouble();
		
		//comparing
		
		if(num1 == num2) {
			System.out.println( num1 + "is equal to "+ num2);
		
		}else if(num1 < num2){
			
		System.out.println( num1 + "is less than "+ num2);
			
		}else{
			
		System.out.println( num1 + "is greater then " + num2);	
	
		}
	
	     scanner.close();
	     
	}

}

