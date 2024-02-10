package Quiz;

public class FindDuplicates {

	public static void main(String[] args) {
		        // Given array
		        int[] numbers = {4, 2, 8, 3, 7, 2, 8, 1, 4, 6, 5, 3};

		        // Find and print duplicate numbers
		        findDuplicates(numbers);
		    }

		    static void findDuplicates(int[] arr) {
		        System.out.print("Duplicate Numbers: ");
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] == arr[j]) {
		                    System.out.print(arr[i] + " ");
		                    break;  // To avoid printing the same duplicate multiple times
		                }
		            }
		        }
		    }
		


	}


