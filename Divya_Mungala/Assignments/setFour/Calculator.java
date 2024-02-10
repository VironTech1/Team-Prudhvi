package setFour;

	public class Calculator {
	    // Arithmetic Operations
	    public static double add(double num1, double num2) {
	        return num1 + num2;
	    }

	    public static double subtract(double num1, double num2) {
	        return num1 - num2;
	    }

	    public static double multiply(double num1, double num2) {
	        return num1 * num2;
	    }

	    public static double divide(double num1, double num2) {
	        if (num2 != 0) {
	            return num1 / num2;
	        } else {
	            System.out.println("Cannot divide by zero!");
	            return Double.NaN; // Not a Number
	        }
	    }

	    // Conversion Operations
	    public static double poundsToKilograms(double pounds) {
	        return pounds * 0.453592;
	    }

	    public static double kilogramsToPounds(double kilograms) {
	        return kilograms / 0.453592;
	    }

	    public static double milesToKilometers(double miles) {
	        return miles * 1.60934;
	    }

	    public static double kilometersToMiles(double kilometers) {
	        return kilometers / 1.60934;
	    }

	    public static void main(String[] args) {
	        // Arithmetic operations
	        System.out.println("5 + 3 = " + add(5, 3));
	        System.out.println("5 - 3 = " + subtract(5, 3));
	        System.out.println("5 * 3 = " + multiply(5, 3));
	        System.out.println("5 / 3 = " + divide(5, 3));

	        // Conversion operations
	        System.out.println("10 pounds to kilograms: " + poundsToKilograms(10));
	        System.out.println("5 kilograms to pounds: " + kilogramsToPounds(5));
	        System.out.println("10 miles to kilometers: " + milesToKilometers(10));
	        System.out.println("5 kilometers to miles: " + kilometersToMiles(5));
	    }
	}

