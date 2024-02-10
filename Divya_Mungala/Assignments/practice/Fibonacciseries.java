package practice;

public class Fibonacciseries {

	public static void main(String[] args) {
		
		        int n = 10; 
		       generateFibonacci(n);
		    }

		    public static void generateFibonacci(int n) {
		    	
		        int num1 = 0, num2 = 1;
		        
		        System.out.println("Fibonacci Series up to " + n + " terms:");
		        

		        for (int i = 1; i <= n; ++i) {
		        	
		            System.out.print(num1 + " ");

		         
		            int sum = num1 + num2;
		            num1 = num2;
		            num2 = sum;
		        }
		    }
		

	}

