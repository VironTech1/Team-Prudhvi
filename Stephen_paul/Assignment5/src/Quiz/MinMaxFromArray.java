package Quiz;

public class MinMaxFromArray {

	public static void main(String[] args) {
		        // Given array
		        int[] array = {3, 8, 2, 5, 10, 7, 1, 6, 4, 9};

		        // Initialize max and min with the first element of the array
		        int max = array[0];
		        int min = array[0];

		        // Iterate through the array to find max and min
		        for (int i = 1; i < array.length; i++) {
		            if (array[i] > max) {
		                max = array[i];
		            } else if (array[i] < min) {
		                min = array[i];
		            }
		        }

		        // Print the results
		        System.out.println("Maximum number in the array: " + max);
		        System.out.println("Minimum number in the array: " + min);
		    }


	}


