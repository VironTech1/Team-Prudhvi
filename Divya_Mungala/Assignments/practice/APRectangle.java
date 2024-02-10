package practice;
import java.util.Scanner;

public class APRectangle {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of Rectangle: ");
		
		double length = scanner.nextDouble() ;
		
		System.out.println("Enter the width of Rectangle: ");
		
		double width = scanner.nextDouble();	
		
		double area = length * width;
		
		double perimeter = 2*(length+width) ;
	
		
		System.out.println("The area of Rectangle is: " + area);
		
		System.out.println("The perimeter of Rectangle is: " + perimeter);
		
	}

}
