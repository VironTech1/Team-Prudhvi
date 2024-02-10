import java.util.Scanner;
public class PalindromeCheck {

	public static void main(String[] args) {
		
		        // Create a Scanner object to take input from the user
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter a number
		        System.out.println("Enter a Number:");

		        // Read the integer input provided by the user
		        int number = scanner.nextInt();

		        // Check if the number is a palindrome
		        if (isPalindrome(number)) {
		            System.out.println(number + " is a Palindrome.");
		        } else {
		            System.out.println(number + " is not a Palindrome.");
		        }
		    }

		    // Function to check if a number is a palindrome
		    private static boolean isPalindrome(int num) {
		        // Store the original number for comparison later
		        int originalNumber = num;
		        
		        // Initialize a variable to store the reversed number
		        int reversedNumber = 0;

		        // Loop to reverse the digits of the number
		        while (num != 0) {
		            reversedNumber = reversedNumber * 10 + num % 10;
		            num /= 10;
		        }

		        // Check if the original number is equal to its reversed version
		        return originalNumber == reversedNumber;



	}

}
