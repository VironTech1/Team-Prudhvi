import java.util.Scanner;
public class DistanceConverter {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Choose an option:");
		        System.out.println("1. Kilometers to Meters and Centimeters");
		        System.out.println("2. Meters and Centimeters to Kilometers");
		        int choice = scanner.nextInt();

		        if (choice == 1) {
		            // Kilometers to Meters and Centimeters
		            System.out.println("Enter distance in kilometers:");
		            double kilometers = scanner.nextDouble();

		            double meters = kilometers * 1000;
		            int remainingMeters = (int) meters;
		            double centimeters = (meters - remainingMeters) * 100;

		            System.out.println("Converted distance: " + remainingMeters + " meters and " + centimeters + " centimeters");
		        } else if (choice == 2) {
		            // Meters and Centimeters to Kilometers
		            System.out.println("Enter distance in meters:");
		            int meters = scanner.nextInt();

		            System.out.println("Enter distance in centimeters:");
		            double centimeters = scanner.nextDouble();

		            double kilometers = meters / 1000.0 + centimeters / 100.0;

		            System.out.println("Converted distance: " + kilometers + " kilometers");
		        } else {
		            System.out.println("Invalid choice");
		        }

		        scanner.close();
		    }

	}

