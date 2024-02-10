//A=πr2
//Write a Java program to print the area and perimeter of a circle,square,rect angle, parallelogram etc..
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner input1= new Scanner(System.in);
        System.out.println("Enter Value of r");
        System.out.println("Enter the value of A");
        float r=(float)input.nextInt();
        float a=(float)input1.nextInt();
        float pie=(float)3.14;
        double A= (double) (pie*(r*r));
        System.out.println("Area of a circle"+"\n"+ A);
        //Area of Square
        Float Area = a*a;
        System.out.println("Area of square"+"\n"+ Area);


    }

}
