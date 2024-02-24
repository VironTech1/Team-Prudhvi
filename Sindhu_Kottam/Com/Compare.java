package Com;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		if(a==b)
		System.out.println("both are equal");
		else if(a>b)
			System.out.println("a is greater");
		else
			System.out.println("b is greater");

	}

}
