package Com;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int a,l,b,h,r;
	
	
	
	System.out.println("Enter radius of circle");
	r=sc.nextInt();
	System.out.println("Area of circle is "+ (Math.PI*r*r));
	System.out.println("Perimeter of circle is "+(2*Math.PI*r));
		
	
	System.out.println("Enter length of rectangle");
	l=sc.nextInt();
	System.out.println("Enter breadth of rectangle");
	b=sc.nextInt();
	System.out.println("Area of Rectangle is "+ (l*b));
	System.out.println("Perimeter of Rectangle is "+(2*(l+b)));
	
	System.out.println("Enter altitude of parallelogram");
	h=sc.nextInt();
	System.out.println("Enter base of parallelogram");
	b=sc.nextInt();
	System.out.println("Enter side of parallelogram");
	a=sc.nextInt();
	System.out.println("Area of parallelogram is "+ (l*h));
	System.out.println("Perimeter of parallelogram is "+(2*(l+a)));
	
	System.out.println("Enter side of square");
	a=sc.nextInt();
	System.out.println("Area of Square is "+ a*a);
	System.out.println("Perimeter of Square is "+4*a);
		
	}
		
}
