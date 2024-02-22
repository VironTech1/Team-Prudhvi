package Assignments;

public class EMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 100000,i = 1; 
        int t = 5;
        double m = i / 12 / 100;
        int tm = t * 12;
        double emi = (a * m * Math.pow(1 + m, tm))
                / (Math.pow(1 + m, tm) - 1);
        System.out.println("EMI for loan amount " + a + " with tenure of " + t + " years and "
                + i + "% interest rate:");
        System.out.println("EMI per month: " + emi);


	}

}
