package Assignment2;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int [] i = {1,2,3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index to be swapped: ");
        int swap = scanner.nextInt();
        System.out.println("Enter target index: ");
        int target = scanner.nextInt();
        int temp = i[swap];
        i[swap] = i[target];
        i[target] = temp;
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);

    }
}
