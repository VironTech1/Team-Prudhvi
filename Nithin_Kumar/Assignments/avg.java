package Assignments;

import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the three numbers+");
		a=sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		System.out.println("average of three numbers ="+((a+b+c)/3));

	}

}
