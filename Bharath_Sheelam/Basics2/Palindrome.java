package Assignment3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do{
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int i = num;
        int reversed = 0;
        while (i != 0) {
            int digit = i % 10;
            reversed = reversed * 10 + digit;
            i = i / 10;
        }
        if (num == reversed) {
            System.out.println("The given number is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
            System.out.println("Do you want to continue(yes/no)?");
            choice = scanner.next();
        }while(choice.equals("yes"));
        System.out.println("Exiting, thank you");

    }
}