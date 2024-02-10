
//6. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;
public class avgofnum {
    public static void main(String[] args) {
        Scanner input1= new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
        Scanner input3= new Scanner(System.in);
        System.out.println("enter the num's for average");
        float num1=(float) input1.nextInt();
        float num2=(float) input2.nextInt();
        float num3=(float) input3.nextInt();

        Float Average = ((num2) + (num1) + (num3)) / 3;
        System.out.println("Average of Numbers"+"\n"+ Average);
    }
}
