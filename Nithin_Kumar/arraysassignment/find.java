package arraysassignment;

import java.util.Scanner;

public class find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index =-1;
		int j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		j = s.nextInt();
		int[] myarray = {2, 4, 6, 8};
		for(int i = 0;i < myarray.length;i++) {
			if(j==myarray[i]) {
				index=i;
                break;
            }
        }
        if (index != -1) {
        	System.out.println("Index of " + j + " is: " + index);
        }
        else {
            System.out.println("Value " + j + " not found in the array.");
        }
    	s.close();

	}


}
