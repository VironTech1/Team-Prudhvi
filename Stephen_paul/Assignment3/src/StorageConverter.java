import java.util.Scanner;
public class StorageConverter {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Choose an option:");
		        System.out.println("1. KB to MB");
		        System.out.println("2. KB to GB");
		        System.out.println("3. MB to KB");
		        System.out.println("4. GB to KB");
		        int choice = scanner.nextInt();

		        System.out.println("Enter amount:");
		        double amount = scanner.nextDouble();

		        switch (choice) {
		            case 1:
		                convertKBtoMB(amount);
		                break;
		            case 2:
		                convertKBtoGB(amount);
		                break;
		            case 3:
		                convertMBtoKB(amount);
		                break;
		            case 4:
		                convertGBtoKB(amount);
		                break;
		            default:
		                System.out.println("Invalid choice");
		        }

		        scanner.close();
		    }

		    private static void convertKBtoMB(double amount) {
		        double convertedAmount = amount / 1024; // 1 MB = 1024 KB
		        System.out.println("Converted amount: " + convertedAmount + " MB");
		    }

		    private static void convertKBtoGB(double amount) {
		        double convertedAmount = amount / (1024 * 1024); // 1 GB = 1024 MB
		        System.out.println("Converted amount: " + convertedAmount + " GB");
		    }

		    private static void convertMBtoKB(double amount) {
		        double convertedAmount = amount * 1024; // 1 MB = 1024 KB
		        System.out.println("Converted amount: " + convertedAmount + " KB");
		    }

		    private static void convertGBtoKB(double amount) {
		        double convertedAmount = amount * (1024 * 1024); // 1 GB = 1024 MB
		        System.out.println("Converted amount: " + convertedAmount + " KB");
		    }
		


	}


