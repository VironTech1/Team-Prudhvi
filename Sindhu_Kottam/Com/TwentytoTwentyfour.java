package Com;

import java.util.Scanner;

public class TwentytoTwentyfour {
public static void main(String args[])
{
	TwentytoTwentyfour tt=new TwentytoTwentyfour();
	Scanner sc=new Scanner(System.in);
	
	int a,b,c;
	System.out.println("Enter a");
	a=sc.nextInt();
	System.out.println("Enter b");
	b=sc.nextInt();
	System.out.println("Enter c");
	c=sc.nextInt();
	
	System.out.println("Maximum of abc is "+tt.Max(a, b, c));
	System.out.println("Minimum of abc is "+tt.Min(a, b, c));
	System.out.print(a+" is ");
	tt.EvenOdd(a);
	System.out.print(b+" is ");
	tt.EvenOdd(b);
	System.out.print(c+" is ");
	tt.EvenOdd(c);
	System.out.println("Multiple of 5 or not");
	System.out.print(a+" is ");
	tt.Mul(a);
	System.out.print(b+" is ");
	tt.Mul(b);
	System.out.print(c+" is ");
	tt.Mul(c);
	System.out.println("Squares of abc are");
	System.out.print("Square of "+a+" is ");
	tt.Squares(a);
	System.out.print("square of "+b+" is ");
	tt.Squares(b);
	System.out.print("square of "+c+" is ");
	tt.Squares(c);
}
	public int Max(int a,int b,int c)
	{int max=0;
		if(a>b &&a>c)
			max=a;
		else if(b>a &&b>c)
			max=b;
		else if(c>a &&c>b)
			max=c;
		return max;
	}
	public int Min(int a,int b,int c)
	{int min=0;
		if(a<b &&a<c)
			min=a;
		else if(b<a &&b<c)
			min=b;
		else if(c<a &&c<b)
			min=c;
		return min;
	}
	public void EvenOdd(int a)
	{
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	
	public void Mul(int a)
	{
		if(a%5==0)
		{
			System.out.println("Mutliple of 5");
		}
		else
			System.out.println("Not a Mutliple of 5");
	}
	public void Squares(int a)
	{
		System.out.println( a*a);
	}
}
