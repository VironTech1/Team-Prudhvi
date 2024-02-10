import java.util.Scanner;
public class CurrencyConverter {
		

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Choose an option:");
		        System.out.println("1. USD to EUR");
		        System.out.println("2. USD to INR");
		        System.out.println("3. EUR to USD");
		        System.out.println("4. INR to USD");
		        int choice = scanner.nextInt();

		        System.out.println("Enter amount:");
		        double amount = scanner.nextDouble();

		        switch (choice) {
		            case 1:
		                convertUSDtoEUR(amount);
		                break;
		            case 2:
		                convertUSDtoINR(amount);
		                break;
		            case 3:
		                convertEURtoUSD(amount);
		                break;
		            case 4:
		                convertINRtoUSD(amount);
		                break;
		            default:
		                System.out.println("Invalid choice");
		        }

		        scanner.close();
		    }

		    private static void convertUSDtoEUR(double amount) {
		        double convertedAmount = amount * 0.85; // Conversion rate as an example
		        System.out.println("Converted amount: " + convertedAmount + " EUR");
		    }

		    private static void convertUSDtoINR(double amount) {
		        double convertedAmount = amount * 73.5; // Conversion rate as an example
		        System.out.println("Converted amount: " + convertedAmount + " INR");
		    }

		    private static void convertEURtoUSD(double amount) {
		        double convertedAmount = amount / 0.85; // Conversion rate as an example
		        System.out.println("Converted amount: " + convertedAmount + " USD");
		    }

		    private static void convertINRtoUSD(double amount) {
		        double convertedAmount = amount / 73.5; // Conversion rate as an example
		        System.out.println("Converted amount: " + convertedAmount + " USD");
		    }
	


	}


