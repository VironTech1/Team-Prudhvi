package setthree;
import java.util.Scanner;
public class ReverseofNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverse(number);
        System.out.println("Reverse of " + number + " is: " + reversedNumber);
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;

	}

}
