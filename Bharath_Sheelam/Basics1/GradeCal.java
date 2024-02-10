//18. Write a program to calculate grade(Distinction,First,Second,Third) of  student based on average mark?

import java.util.Scanner;

public class GradeCal {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the Student Marks to View Catogory");
        double Score=(double)S.nextInt();
        if (Score>=90) {
            System.out.println("Distinction");
        }
        else if (Score>=80 && Score<=90){
            System.out.println("First Grade ");
        }
        else if (Score>=70 && Score<=80){
            System.out.println("Second Grade");
        }
        else {
            System.out.println("Fail");
        }



    }
}
