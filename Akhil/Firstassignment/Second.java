//first list of assignments
//25 questions part 2
package learning.Firstassignment;

import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //q11(kilometers to metrs and centimeters)

        System.out.println(" enter the value of kilometers 'a' : ");
        int a = sc.nextInt();
        int b= a*1000;
        System.out.println("the value of a in meters is :  "+ b);
        int c= b*100;
        System.out.println("the value of a in centimetres is : "+ c);
        //vice versa
        System.out.println("ENTER THE VALUE in CENTIMETRE 'x' : ");
        int x = sc.nextInt();

        int y = (x/100);
        System.out.println("the value of x in meters is : "+ y);
        int z= (y/1000);
        System.out.println("the value of x in kilometers is  :"+ z);

        // q12(hours to minutes and seconds)
        System.out.println("enter the value in hours h : ");
        int h=sc.nextInt();

        int m=h*60;
        System.out.println("the value in minutes is m: "+ m);
        int s = m*60;
        System.out.println("the value in seconds is s "+ s);
        //viceversa
        System.out.println("enter the value in seconds : ");
        int S= sc.nextInt();

        int M = (S/60);
        System.out.println("the value in minutes : "+ M);
        int H = (M/60);
        System.out.println("the value in Hours : "+ H);
        //Q13(KILOGRAMS TO GRAMS)
        System.out.println("enter the value in kilograms: ");
        int k= sc.nextInt();

        int g = (k*1000);
        System.out.println("the value in grams : "+ g);
        //viceversa
        System.out.println("enter the value in grams: ");
        int G=sc.nextInt();

        int K = (G/1000);
        System.out.println(" the value in kilograms is "+ K);

        //Q15(KB TO MB TO GB)
        System.out.println("enter the value in kilobytes:");
        int kb= sc.nextInt();

        int mb= (kb*1024);
        System.out.println("the value in megabytes: "+ mb);
        int gb = (mb*1024);
        System.out.println("the value in Giga bytes"+ gb);
        //viceversa
        System.out.println("enter the value in GIGA BYTES:");
        int GB = sc.nextInt();

        int MB = (GB/1024);
        System.out.println("the value in MEGA BYTES : "+ MB);
        int KB = (MB/1024);
        System.out.println("the value in Kilo bytes : "+ KB);

        //q18(grade calculation)
        System.out.println("enter the marks :");
        int marks=sc.nextInt();

        if(marks>=90){
            System.out.println("grade a ");
        }
        else if(marks>=70&&marks<90){
            System.out.println("garde b");

        }
        else if(marks>=60&&marks<70){
            System.out.println("grade c");
        }
        else if (marks<60){
            System.out.println("RESTART");
        }
        else{
            System.out.println("INVALID INPUT");
        }

        //16. Write a program for BMI (Body Mass index)?

        System.out.println("enter the weight in kilograms : ");

        double weight=sc.nextDouble();

        System.out.println("enter your height in meters : ");

        double height = sc.nextDouble();

        double BMI=(weight/((height)*(height)));

        System.out.println("the value of BMI IS : "+ BMI);

        //19. Write a program to calculate current bill based on units
        // (Units : 1-100 - 3rs, 101- 200- 4rs, 201 -300- 5 rs, 301 and above 6 rs) ?
        System.out.println("enter the units : ");
        int units=sc.nextInt();
        int bill=0;
        if(units>=1&&units<=100){
            bill = 3;
            System.out.println("the bill is : "+bill+"rs");
        } else if(units>=101&&units<=200) {
            bill =4;
            System.out.println("the bill is : "+bill+"rs");

        } else if (units>=201&&units<=300) {
            bill=5;
            System.out.println("the bill is : "+bill+"rs");

        }else if(units>=301){
            bill=6;
            System.out.println("the bill is : "+bill+"rs");
        }
        else {
            System.out.println("invalid input");
        }


    }



}
