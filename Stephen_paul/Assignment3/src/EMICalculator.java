import java.util.Scanner;
public class EMICalculator {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter Loan Amount: ");
		        double loanAmount = scanner.nextDouble();

		        System.out.println("Enter Loan Tenure in Years: ");
		        int tenureInYears = scanner.nextInt();

		        System.out.println("Enter Annual Interest Rate: ");
		        double annualInterestRate = scanner.nextDouble();

		        // Convert annual interest rate to monthly
		        double monthlyInterestRate = annualInterestRate / 12 / 100;

		        // Convert tenure to months
		        int tenureInMonths = tenureInYears * 12;

		        // Calculate EMI using the formula
		        double emi = (loanAmount * monthlyInterestRate) /
		                (1 - Math.pow(1 + monthlyInterestRate, -tenureInMonths));

		        System.out.println("EMI for the given loan: " + emi);
		    }


	}
