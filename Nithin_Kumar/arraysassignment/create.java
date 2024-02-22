package arraysassignment;

import java.util.Scanner;

public class create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] myarray = new int[4];
		for (int i = 0; i < myarray.length; i++) {
		    myarray[i]= s.nextInt();;
		}
		for (int i = 0; i < myarray.length; i++) {
		    System.out.print(myarray[i] + " ");
		}
	}

}
