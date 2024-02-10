import java.util.*;
public class BinaryConverter {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter a number
		        System.out.print("Enter a number: ");
		        int decimalNumber = scanner.nextInt();

		        // Convert the decimal number to binary
		        String binaryString = Integer.toBinaryString(decimalNumber);

		        // Print the binary representation
		        System.out.println("Binary representation: " + binaryString);
		    }
		


	}

