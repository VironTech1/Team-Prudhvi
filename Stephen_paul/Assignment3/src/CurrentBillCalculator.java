import java.util.Scanner;
public class CurrentBillCalculator {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the number of units consumed:");
		        int units = scanner.nextInt();

		        double billAmount = calculateBill(units);

		        System.out.println("Current Bill Amount: Rs. " + billAmount);

		        scanner.close();
		    }

		    private static double calculateBill(int units) {
		        double rate;
		        if (units >= 1 && units <= 100) {
		            rate = 3.0;
		        } else if (units <= 200) {
		            rate = 4.0;
		        } else if (units <= 300) {
		            rate = 5.0;
		        } else {
		            rate = 6.0;
		        }

		        return units * rate;
		    }
		



	}


