package Assignment2;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int i[] = {0, 1, 2, 3, 4, 5};
        int sum = 0;
        for (int index = 0; index < i.length; index++) {
            sum = sum + i[index];
        }
        System.out.println(sum);
    }
}
