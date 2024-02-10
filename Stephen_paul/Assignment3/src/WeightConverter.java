import java.util.Scanner;
public class WeightConverter {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Choose an option:");
		        System.out.println("1. Kilograms to Grams");
		        System.out.println("2. Grams to Kilograms");
		        int choice = scanner.nextInt();

		        if (choice == 1) {
		            System.out.println("Enter weight in kilograms:");
		            double kilograms = scanner.nextDouble();
		            convertToGrams(kilograms);
		        } else if (choice == 2) {
		            System.out.println("Enter weight in grams:");
		            double grams = scanner.nextDouble();
		            convertToKilograms(grams);
		        } else {
		            System.out.println("Invalid choice");
		        }

		        scanner.close();
		    }

		    private static void convertToGrams(double kilograms) {
		        double grams = kilograms * 1000;
		        System.out.println("Converted weight: " + grams + " grams");
		    }

		    private static void convertToKilograms(double grams) {
		        double kilograms = grams / 1000;
		        System.out.println("Converted weight: " + kilograms + " kilograms");
		    }



	}

