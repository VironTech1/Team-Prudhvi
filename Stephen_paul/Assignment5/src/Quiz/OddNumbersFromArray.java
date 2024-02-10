package Quiz;

public class OddNumbersFromArray {

	public static void main(String[] args) {
		        // Given array
		        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		        // Print odd numbers
		        System.out.println("Odd numbers in the array:");

		        for (int i = 0; i < array.length; i++) {
		            // Check if the current element is odd
		            if (array[i] % 2 != 0) {
		                System.out.print(array[i] + " ");
		            }
		        }
		    }


	}
