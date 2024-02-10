package Quiz;

public class SwapNumbers {

	public static void main(String[] args) {
		        int[] numbers = {4, 2, 8, 3, 7, 6};
		        int index1 = 1, index2 = 4;

		        System.out.println("Array before swapping: ");
		        printArray(numbers);

		        // Swap numbers using a single line
		        int temp = numbers[index1];
		        numbers[index1] = numbers[index2];
		        numbers[index2] = temp;

		        System.out.println("\nArray after swapping: ");
		        printArray(numbers);
		    }

		    static void printArray(int[] arr) {
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }
		

	}
