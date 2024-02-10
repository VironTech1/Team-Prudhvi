package practice;

public class interest {

	public static void main(String[] args) {
		
	 double loanAmount = 100000;
	 double tenureMonths = 5 * 12; //converting into months
	 double annualInterestRate = 1;
	 
	 double monthlyInterestRates = annualInterestRate / 12/ 100;
	 
     double EMI = (loanAmount * monthlyInterestRates) / (1 - Math.pow(1 + monthlyInterestRates, -tenureMonths));
    
     System.out.println("EMI for loan amount Rs. " + loanAmount + ", tenure " + (tenureMonths / 12) +
             " years, and interest rate " + annualInterestRate + "% is: Rs. " + EMI);
     
     
		
	}

}
