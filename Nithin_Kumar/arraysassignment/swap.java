package arraysassignment;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = new int[4];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of the array");
		for(int i=0;i<myarray.length;i++) {
			myarray[i] = sc.nextInt();
		}
		int i1,i2;
		System.out.println("enter the indexes for swapping:");
		i1=sc.nextInt();
		i2=sc.nextInt();
		 if (i1 >= 0 && i1 < myarray.length && i2 >= 0 && i2 < myarray.length) {
	            int temp = myarray[i1];
	            myarray[i1] = myarray[i2];
	            myarray[i2] = temp;

	            System.out.println("Array after swapping:");
	            for (int i = 0; i < myarray.length; i++) {
	                System.out.print(myarray[i] + " ");
	            }
	        } else {
	            System.out.println("Invalid");
	        }

	}

}
