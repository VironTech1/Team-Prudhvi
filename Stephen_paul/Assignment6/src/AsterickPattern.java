
public class AsterickPattern {

	public static void main(String[] args) {
		
		        int n = 5; // Number of rows

		        // Outer loop for the number of rows
		        for (int i = 1; i <= n; i++) {

		            // Inner loop for printing asterisks in each row
		            for (int j = 1; j <= i; j++) {
		                System.out.print("*");
		            }

		            // Move to the next line after printing each row
		            System.out.println();
		        }
		    }



	}


