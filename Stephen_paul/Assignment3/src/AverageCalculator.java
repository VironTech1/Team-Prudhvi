import java.util.Scanner;
public class AverageCalculator {

	public static void main(String[] args) {
	{
		        // Create a Scanner object to read input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter three numbers
		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();

		        System.out.print("Enter the third number: ");
		        double num3 = scanner.nextDouble();

		        // Calculate the average
		        double average = (num1 + num2 + num3) / 3;

		        // Print the result
		        System.out.println("The average of the three numbers is: " + average);

		        // Close the Scanner
		        scanner.close();
		    }
		}

	}

