package arraysassignment;

import java.util.Arrays;
import java.util.Scanner;

public class copy {

    public static void main(String[] args) {
        int[] myarray1 = new int[4];
        int[] myarray2 = new int[4];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter values for myarray1:");
        for (int i = 0; i < myarray1.length; i++) {
            myarray1[i] = s.nextInt();
        }
        System.out.println("myarray1 = " + Arrays.toString(myarray1));
        int[] temp = myarray1;
        myarray1 = myarray2;
        myarray2 = temp;
        
        System.out.println("After swapping the arrays:");
        System.out.println("myarray1 = " + Arrays.toString(myarray1));
        System.out.println("myarray2 = " + Arrays.toString(myarray2));
    }
}