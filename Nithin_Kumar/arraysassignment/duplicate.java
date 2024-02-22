package arraysassignment;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int[] myarray = new int[4];
		System.out.println("enter the values of the array");
		for(int i=0;i<myarray.length;i++) {
			myarray[i]=sc.nextInt();
		}
		System.out.println("Duplicate numbers in the array");
		for (int i =0; i<myarray.length-1;i++) {
			for(int j=i+1;j<myarray.length;j++) {
				if(myarray[i]==myarray[j]) {
					System.out.println(myarray[j]);
					break;
				}
			}
		}
		sc.close();

	}

}
