package Assignment2;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        int i[] = {0,1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int find = scanner.nextInt();
        int j = -1;
        for (int index=0; index<i.length;index++){
            if (i[index] == find){
                j = index;
                System.out.println("The given number is found and it's index is "+index);
            }
        }
        if (j == -1){
            System.out.println("The given number is not found in the array");
        }

    }
}
