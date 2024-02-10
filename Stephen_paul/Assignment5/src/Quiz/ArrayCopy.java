package Quiz;

public class ArrayCopy {

	public static void main(String[] args) {
		        // Given array
		        int[] sourceArray = {1, 2, 3, 4, 5};

		        // Create a new array with the same length as the source array
		        int[] destinationArray = new int[sourceArray.length];

		        // Use System.arraycopy to copy elements from source to destination
		        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

		        // Print the elements of the destination array
		        System.out.print("Copied Array: ");
		        for (int num : destinationArray) {
		            System.out.print(num + " ");
		        }
		    }


	}

