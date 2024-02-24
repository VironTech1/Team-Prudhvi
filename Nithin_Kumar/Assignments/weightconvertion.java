package Assignments;

import java.util.Scanner;

public class weightconvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double kilograms = s.nextDouble();
        double grams = kilograms * 1000;
        System.out.println("weight in grams: " + grams + " g");
        double kilogramsconv = grams / 1000;
        System.out.println("weight in grams (converted back): " + grams + " g");
        System.out.println("weight in kilograms (converted back): " + kilogramsconv + " kg");

	}

}
