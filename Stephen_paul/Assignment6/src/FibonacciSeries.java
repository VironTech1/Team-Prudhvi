
public class FibonacciSeries {

	public static void main(String[] args) {
		        int n = 10; // You can change this value to the desired number of terms

		        int firstTerm = 0, secondTerm = 1;

		        System.out.println("Fibonacci Series:");

		        for (int i = 1; i <= n; i++) {
		            System.out.print(firstTerm + " ");

		            int nextTerm = firstTerm + secondTerm;
		            firstTerm = secondTerm;
		            secondTerm = nextTerm;
		        }
		    }


	}
