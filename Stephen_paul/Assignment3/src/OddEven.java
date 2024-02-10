import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a number:");
		        int number = scanner.nextInt();

		        String result = (number % 2 == 0) ? "even" : "odd";

		        System.out.println("The given number is " + result);

		        scanner.close();
		    }
		


	}


