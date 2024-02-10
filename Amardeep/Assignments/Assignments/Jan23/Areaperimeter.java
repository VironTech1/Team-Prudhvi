package Assignments.Jan23;

import java.util.Scanner;

public class Areaperimeter {
	

public static void main(String[] args) {
	

		// RECTANGLE
	
		System.out.println("enter length(integer)and breadth(integer) of rectangle");
		
		Scanner sc= new Scanner(System.in);
		
		int l =sc.nextInt();
		
		int b =sc.nextInt();
		
		int Rarea = l*b;
		
		int Rperim=2*(l*b);
		
		System.out.println("Area of rectangle is : "+ Rarea + "Perimeter of rectangle is :"+ Rperim);
		
		
		//SQUARE
		
        System.out.println("enter side(integer) of square");
		
		int s =sc.nextInt();
		
		
		int Sarea = s*s;
		
		int Sperim=4*s;
		
		System.out.println("Area of square is : "+ Sarea +"Perimeter of square is :"+ Sperim);
		
		
		//CIRCLE
		
		
        System.out.println("enter radius(integer) of circle");
		
		int r =sc.nextInt();
		
		
		double Carea = 3.14 * (r*r);
		
		double Cperim=2*3.14*r;
		
		System.out.println("Area of circle is : "+ Carea +"Perimeter of circle is :"+ Cperim);
		
		
		//PARALLELOGRAM
		
        System.out.println("enter base(integer) and height(integer) of circle");
		
		int bs =sc.nextInt();
		
		int h =sc.nextInt();

		
		double Parea = bs*h;
		
		double Pperim= 4*b;
		System.out.println();
		System.out.println();
		
		System.out.println("Area of parallelogram is : "+ Parea +"/nPerimeter of parallelogram is :"+ Pperim);
		
}
}
