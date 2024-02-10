package practice;

import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		
	    //rectangle
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of Rectangle : ");
		double length = scanner.nextDouble();
        System.out.println("Enter the breadth of rectangle : " );
		double breadth = scanner.nextDouble();
		
	    double Area = length * breadth;
	    System.out.println("Area of the Rectangle is: " + Area );
	    double perimeter= 2* (length + breadth);
	    System.out.println("perimeter of the Rectangle is: " + perimeter );
	   
        //square
	     
	    System.out.println("Enter the side of a square: ");
		double sideLength = scanner.nextDouble();
		
		double Area1 = (sideLength * sideLength) ;
		System.out.println("Area of square is : " + Area1);
		double perimeter1 = 4 * sideLength ;
	    System.out.println("perimeter of square is : "  + perimeter1);
	   
       //circle
	    float pie = 3.14f;
	    
	    System.out.println("Enter radius of circle: ");
		double radius = scanner.nextDouble();
		
		double Area2 = pie * radius * radius ;
		System.out.println("Arear of circle is : " + Area2);
		double perimeter2 = 2 * pie * radius ;
	    System.out.println("perimeter of circle is : "  + perimeter2);
		
        //pareelogram
	    
	
	    System.out.println("Enter the base of parellogram : " );
		double base = scanner.nextDouble();

	    System.out.println("Enter the height of : " );
		double height = scanner.nextDouble();
		double Area3 = base * height ;
		System.out.println("Area of parellogram is : " + Area3);
         double perimeter3 = 2 * base   ; //baselenght (a+b)
	    System.out.println("perimeter of parellogram is  : "  + perimeter3);
	
	    scanner.close();
	}

}
