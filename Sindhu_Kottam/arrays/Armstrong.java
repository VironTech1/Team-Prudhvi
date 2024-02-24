package arrays;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of digits");
		int n=sc.nextInt();
		
		System.out.println("Enter your number");
		int num=sc.nextInt();
		int num1=num;
		double sum=0;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+Math.pow(digit,n);
			num=num/10;
		}
		System.out.println("Sum of digits of your number is :"+sum);
		
		if(num1==sum)
		{
			System.out.println("is a Armstrong number");
		}
		else
			System.out.println("Not Armstrong");
	}

}
