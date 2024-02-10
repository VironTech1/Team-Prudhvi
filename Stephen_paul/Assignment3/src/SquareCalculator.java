import java.util.Scanner;
public class SquareCalculator {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a number:");
		        int number = scanner.nextInt();

		        int square = number * number;

		        System.out.println("Square of the given number is: " + square);

		        scanner.close();
		    }
		


	}


