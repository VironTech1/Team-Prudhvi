import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number:" );
		int number =s. nextInt();
		int factorial = 1;
		for (int i =1;i<=number; i++) {
			factorial *= i;
			
		}
		System.out.println("The Factorial of the "+ number + "is" + factorial );
		
	
	}

}
