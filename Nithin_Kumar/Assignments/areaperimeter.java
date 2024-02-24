package Assignments;

import java.util.Scanner;

public class areaperimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area,perimeter,pi=3.14;
		int r,l,b;
		System.out.println("please enter the radius of circle");
		Scanner sc = new Scanner(System.in);
		r=sc.nextInt();
		System.out.println("area of circle="+ (pi*(r*r)) + "\n" + (2*pi*r) );
		System.out.println("please enter the side of square");
		int s = sc.nextInt();
		System.out.println("area of square="+(s*s) + (s+s));
		System.out.println("please enter the lenght and breadth of the rectangle");
		l= sc.nextInt();
		b=sc.nextInt();
		System.out.println("area and perimeter of rectangle"+(l*b) + (2*(l+b)));

	}

}
