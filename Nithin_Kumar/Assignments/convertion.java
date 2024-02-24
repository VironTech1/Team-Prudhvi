package Assignments;

import java.util.Scanner;

public class convertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = s.nextDouble();
        double meters = kilometers * 1000;
        double centimeters = meters * 100;
        System.out.println("Distance in meters: " + meters + " m");
        System.out.println("Distance in centimeters: " + centimeters + " cm");
        double metersConverted = centimeters / 100;
        double kilometersConverted = metersConverted / 1000;
        System.out.println("Distance in meters (converted back): " + metersConverted + " m");
        System.out.println("Distance in kilometers (converted back): " + kilometersConverted + " km");
	}

}
