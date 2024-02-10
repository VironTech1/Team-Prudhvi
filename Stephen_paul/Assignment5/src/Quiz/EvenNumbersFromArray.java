package Quiz;

public class EvenNumbersFromArray {

	public static void main(String[] args) {
		        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		        // Print even numbers
		        System.out.println("Even numbers in the array:");

		        for (int i = 0; i < array.length; i++) {
		            // Check if the current element is even
		            if (array[i] % 2 == 0) {
		                System.out.print(array[i] + " ");
		            }
		        }
		    }


	}

