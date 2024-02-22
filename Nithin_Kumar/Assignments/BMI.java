package Assignments;

import java.util.Scanner;

public class BMI {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        System.out.println("BMI Calculator");
	        System.out.print("Enter your weight in kilograms: ");
	        double w = s.nextDouble();

	        System.out.print("Enter your height in meters: ");
	        double h = s.nextDouble();

	        double bmi = w / (h * h);
	        
	        System.out.println("Your BMI is: " + bmi);

	        // Interpretation
	        String category;
	        if (bmi < 18.5) {
	            category = "Underweight";
	        } else if (bmi < 25) {
	            category = "Normal weight";
	        } else if (bmi < 30) {
	            category = "Overweight";
	        } else {
	            category = "Obese";
	        }
	        
	        System.out.println("Interpretation: " + category);
	    }

}
