package Assignments;

import java.util.Scanner;

public class gold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g,s;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the grams of gold and stone");
		s=sc.nextInt();
		g=sc.nextInt();
		double cost = ((g*5250)+10)+((s*1500)+18);
		System.out.println("the total cost ="+ cost);
		sc.close();

	}

}
