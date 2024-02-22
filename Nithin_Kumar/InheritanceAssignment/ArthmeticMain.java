package InheritanceAssignment;

import java.util.Scanner;

public class ArthmeticMain extends Arthmetic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arthmetic arithmetic = new Arthmetic();

        System.out.print("Enter value for 'a': ");
        arithmetic.a = scanner.nextInt();

        System.out.print("Enter value for 'b': ");
        arithmetic.b = scanner.nextInt();

        arithmetic.sum();
        arithmetic.sub();
        arithmetic.multiplication();
        arithmetic.divide();

        scanner.close();
    }
}