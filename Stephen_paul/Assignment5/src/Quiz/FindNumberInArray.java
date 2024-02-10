package Quiz;

public class FindNumberInArray {

	public static void main(String[] args) {
		        // Given array
		        int[] array = {12, 13, 14, 15, 1, 6};
		        
		        // Number to find
		        int targetNumber = 15;
		        
		        // Find and print the index
		        int index = findNumberIndex(array, targetNumber);
		        
		        // Check if the number is found
		        if (index != -1) {
		            System.out.println("Number " + targetNumber + " found at index: " + index);
		        } else {
		            System.out.println("Number " + targetNumber + " not found in the array.");
		        }
		    }

		    // Method to find the index of a given number in the array
		    private static int findNumberIndex(int[] array, int targetNumber) {
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] == targetNumber) {
		                return i; // Return the index if the number is found
		            }
		        }
		        
		        return -1; // Return -1 if the number is not found
		    }


	}

