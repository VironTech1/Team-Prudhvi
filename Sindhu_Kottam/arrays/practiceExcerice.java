package arrays;

import java.util.Scanner;

public class practiceExcerice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,i,mul=1,j;
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("First 10 natural numbers");
		for(i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nSum of first 10 natural numbers");
		for(i=1;i<=10;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("Multiplication of first 10 natural numbers");
		for(i=1;i<=10;i++)
		{
			mul*=i;
		}
		System.out.println(mul);
		System.out.println("Multiplication Table-5");
		for(i=1;i<=10;i++)
		{
			System.out.println("5 * "+i+" = "+(5*i));
		}
		System.out.println("Multiplication Table 1-10");
		for(j=1;j<=10;j++)
		{
			System.out.println("============");
			for(i=1;i<=10;i++)
			{
				System.out.println(j+"* "+i+" = "+(j*i));
			}
		}
		System.out.println("============");
		//factorial
		System.out.println("Enter the number for factorial");
		int fact=sc.nextInt();
		int factorial=1;
		for(i=1;i<=fact;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
		//reverse and palindrome
		int rn=0;
		System.out.println("Enter number");
		int digit=sc.nextInt();
		int num=digit;
		while (digit != 0) {
            int d = digit % 10;
            rn = rn * 10 + d;
            digit /= 10;
        }
		System.out.println(rn);
		if(num==rn)
		System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
		//prime number
		
		System.out.println("Enter a number");
		int prime=sc.nextInt();
		boolean isPrime=true;
		if(prime>=2)
		{
		for(i=2;i<=prime/2;i++)
		{
			if(prime==2)
				//System.out.println("is a prime");
				isPrime=true;
			else if(prime%i==0)
				//System.out.println("Not a prime");
				{isPrime=false;
			break;}
			
		}
		}
		else
			isPrime=false;
		if(isPrime)
			System.out.println("is a prime");
		else
			System.out.println("Not a prime");
		
		//prime 1-100
		
		for(int k=1;k<=100;k++)
		{
			isPrime=true;
			if(k>=2)
			{
			for(i=2;i<=k/2;i++)
			{
				if(k==2)
					//System.out.println("is a prime");
					isPrime=true;
				else if(k%i==0) {
					//System.out.println("Not a prime");
					isPrime=false;
					break;}
				
			}
			}
			else
				isPrime=false;
			if(isPrime)
				System.out.println(k+" is a prime");
			else
				System.out.println(k+" Not a prime");
			
		}
		
		//Armstrong Number
		int newnum,s=0;
		System.out.println("Enter number");
		newnum=sc.nextInt();
		int num1=newnum;
		while (newnum != 0) {
            int d = newnum % 10;
            s=s+Math.pow(d,n);
            newnum /= 10;
        }
		if(num1==s)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a Armstrong number");
		
		//fibanocci series
		
		System.out.println("Enter a number");
		int fib=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		
		
		for(i=1;i<=fib;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
		
		
		for(i=1;i<=5;i++)
		{System.out.println("");
			for(j=1;j<=i;j++)
			System.out.print(j);
		}
		for(i=1;i<=5;i++)
		{System.out.println("");
			for(j=1;j<=i;j++)
			System.out.print("*");
		}
		for(i=5;i>=1;i--)
		{System.out.println("");
			for(j=i;j>=1;j--)
			System.out.print(j);
		}
		
		
		//binary conversion
		
		int binary[]=new int[10];
		int k=0;
		System.out.println("Enter the number for binary conversion");
		int num=sc.nextInt();
		while(num!=0)
		{
			int digit=num%2;
			binary[k]=digit;
			num=num/2;
			k++;
		}
		
		for(i=k-1;i>=0;i--)
		{
			System.out.print(binary[i]+" ");
		}
		*/
		
		//armstrong number
		
		int newnum,s=0;
		int n=0;
		System.out.println("Enter how many digited number you want to test");
		n=sc.nextInt();
		System.out.println("Enter number");
		newnum=sc.nextInt();
		int num1=newnum;
		while (newnum != 0) {
            int d = newnum % 10;
            s=(int) (s+Math.pow(d,n));
            newnum /= 10;
		}
		if(num1==s)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a Armstrong number");
		
		
		//reverse and palindrome
				int rn=0;
				System.out.println("Enter number");
				int digit=sc.nextInt();
				int num=digit;
				while (digit != 0) {
		            int d = digit % 10;
		            rn = rn * 10 + d;
		            digit /= 10;
		        }
				System.out.println(rn);
				if(num==rn)
				System.out.println("Palindrome");
				else
					System.out.println("Not a Palindrome");
				
		
	}

}
