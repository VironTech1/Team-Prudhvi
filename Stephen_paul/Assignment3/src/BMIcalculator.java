import java.util.Scanner;
public class BMIcalculator {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter your weight in kilograms:");
		        double weight = scanner.nextDouble();

		        System.out.println("Enter your height in meters:");
		        double height = scanner.nextDouble();

		        double bmi = calculateBMI(weight, height);

		        System.out.println("Your BMI is: " + bmi);
		        interpretBMI(bmi);

		        scanner.close();
		    }

		    private static double calculateBMI(double weight, double height) {
		        return weight / (height * height);
		    }

		    private static void interpretBMI(double bmi) {
		        System.out.print("Interpretation: ");
		        if (bmi < 18.5) {
		            System.out.println("Underweight");
		        } else if (bmi >= 18.5 && bmi < 25) {
		            System.out.println("Normal weight");
		        } else if (bmi >= 25 && bmi < 30) {
		            System.out.println("Overweight");
		        } else {
		            System.out.println("Obese");
		        }
		    }
		


	}


