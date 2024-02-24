//day 13 assignment
//5. Calculator can perform various calculations ex add, sub,start, and all other calculations for conversions like weight, distance etc..
// Create a program with all operations and return values
package learning.Assignments;

import java.util.Scanner;

public class Calculatormain {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a : ");
        c.a= sc.nextDouble();
        System.out.print("enter the value of b : ");
        c.b= sc.nextDouble();
        System.out.print("enter your weight in kilograms : ");
        c.weight=sc.nextDouble();
        System.out.println("enter your distance in kilometers : ");
        c.distance=sc.nextDouble();
        double y= c.distanceconverstion(c.distance);
        System.out.println("the distance in meters is : "+y);
        double t=c.weightconverstion(c.weight);
        System.out.println("the weight in grams is : "+t);
        double u=c.add(c.a,c.b);
        System.out.println("THE ADDITION OF a and b is : "+u);
        double p=c.sub(c.a,c.b);
        System.out.println("THE subtraction of a and b is "+p);


    }
}
