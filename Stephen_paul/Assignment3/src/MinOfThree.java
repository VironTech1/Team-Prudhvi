import java.util.Scanner;
public class MinOfThree {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the first number:");
		        int num1 = scanner.nextInt();

		        System.out.println("Enter the second number:");
		        int num2 = scanner.nextInt();

		        System.out.println("Enter the third number:");
		        int num3 = scanner.nextInt();

		        int min = findMin(num1, num2, num3);

		        System.out.println("Minimum of the three numbers: " + min);

		        scanner.close();
		    }

		    private static int findMin(int a, int b, int c) {
		        return Math.min(Math.min(a, b), c);
		    }
		


	}

