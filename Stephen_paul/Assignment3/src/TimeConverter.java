import java.util.Scanner;
public class TimeConverter {

	public static void main(String[] args) {
	

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Choose an option:");
		        System.out.println("1. Hours to Minutes and Seconds");
		        System.out.println("2. Minutes and Seconds to Hours");
		        int choice = scanner.nextInt();

		        if (choice == 1) {
		            System.out.println("Enter time in hours:");
		            int hours = scanner.nextInt();
		            convertToMinutesAndSeconds(hours);
		        } else if (choice == 2) {
		            System.out.println("Enter time in minutes:");
		            int minutes = scanner.nextInt();
		            System.out.println("Enter time in seconds:");
		            int seconds = scanner.nextInt();
		            convertToHours(minutes, seconds);
		        } else {
		            System.out.println("Invalid choice");
		        }

		        scanner.close();
		    }

		    private static void convertToMinutesAndSeconds(int hours) {
		        int minutes = hours * 60;
		        int seconds = hours * 3600;
		        System.out.println("Converted time: " + minutes + " minutes and " + seconds + " seconds");
		    }

		    private static void convertToHours(int minutes, int seconds) {
		        double hours = minutes / 60.0 + seconds / 3600.0;
		        System.out.println("Converted time: " + hours + " hours");
		    }
		


	}


