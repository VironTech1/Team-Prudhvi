import java.util.Scanner;
public class MultipleOfFive {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a number:");
		        int number = scanner.nextInt();

		        boolean isMultipleOfFive = (number % 5 == 0);

		        System.out.println("The given number is " + (isMultipleOfFive ? "multiple of 5" : "not a multiple of 5"));

		        scanner.close();
		    }
		


	}


