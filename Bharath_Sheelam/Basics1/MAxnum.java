import java.util.Scanner;

//20. Wrtie a program to find Maximum of 3 numbers?
public class MAxnum {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        System.out.println("Enter numbers");
        int Number1 = num1.nextInt();
        int Number2 = num1.nextInt();
        int Number3 = num1.nextInt();
        if (Number1 > Number2 && Number1 > Number3) {
            System.out.println("Number1 is MAX ");
        } else if (Number2 > Number1 && Number2 > Number3) {
            System.out.println("Number2 is MAX");
        } else if (Number3 > Number1 && Number3 > Number2) {
            System.out.println("Number3 is MAX ");
        }
    }
}
