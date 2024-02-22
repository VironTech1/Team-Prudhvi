package Assignments;

import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the units:");
		int u;
		Scanner s = new Scanner(System.in);
		u = s.nextInt();
		if(u>=1 || u>=100) {
			System.out.println("Your bill is "+(u*3)+"rs");
		}
		else if (u>100 || u>=200) {
			System.out.println("your bill is " + (u*4)+ "rs");
		}
		else if (u>200 || u>=301) {
			System.out.println("your bill is " + (u*5)+ "rs");
		}
		else {
			System.out.println("your bill is " + (u*6)+ "rs");
		}

	}

}
