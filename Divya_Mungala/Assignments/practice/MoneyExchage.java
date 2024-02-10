package practice;
import java.util.Scanner;

public class MoneyExchage {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        
		 final double UsdToEuro = 0.89;
	        final double UsdToCad = 1.28;
	        final double UsdToAud = 1.32;

	       
	        System.out.print("Enter the amount in USD: $");
	        double amountInUSD = scanner.nextDouble();
	        scanner.close();

	     
	        double amountInEUR = amountInUSD * UsdToEuro;
	        double amountInCAD = amountInUSD *UsdToCad;
	        double amountInAUD = amountInUSD * UsdToAud;

	        System.out.println("$" + amountInUSD + " is approximately:");
	        System.out.println("€" + amountInEUR + " in Euro");
	        System.out.println("CAD $" + amountInCAD + " in Canadian Dollar");
	        System.out.println("AUD $" + amountInAUD + " in Australian Dollar");
	        scanner.close();
	        
	    }
	}


