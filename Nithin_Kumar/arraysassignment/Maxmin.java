package arraysassignment;

import java.util.Scanner;

public class Maxmin {
	public static void main(String[]args) {
		int a =0;
		Scanner s = new Scanner (System.in);
		System.out.println("enter the values for an array");
		int[] myarray= new int[5];
		for(int i=0;i<myarray.length;i++) {
			myarray[i] = s.nextInt();
		}
		int max = myarray[0];
		int min = myarray[0];
		for(int j = 1; j < myarray.length; j++) {
			if(myarray[j]>max) {
				max= myarray[j];
			}
			else if(myarray[j]<min) {
				min= myarray[j];
			}
		}
		System.out.println("Maxixmum value= "+max);
		System.out.println("Minimum values= "+min);
		
	}

}
