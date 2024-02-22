package arrays;

import java.util.Scanner;

public class arrays15 {

	public static void main (String [] sree)
	
    {
		
		/*FIRST 10 NATURAL NUMBERS
		
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
		}

		// SUM OF 10 NATURAL NUMBERS
		int sum=0;

		for (int i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("sum of 10 natural numbers is :"+sum);

		//MULTIPLICATION OF FIRST 10 NATURAL NUMBERS
	
	  int mul=1;

	for (int i=1;i<=10;i++)
	{
		mul=mul*i;
	}
	
	System.out.println("Multiplication of 10 natural numbers is :"+mul);

	

	
	//5 MATHEMATICAL TABLE
	
	
	
			for (int i=1;i<=10;i++)
			{
				System.out.println(" 5 *"+i+"="+(5*i));
			}
			
			//1-10 MATHEMATICL TABLES
			
			for (int i=1;i<10;i++)
			{
				for(int j=1;j<=10;j++)
				{
					System.out.println(i+"*"+j+"="+i*j);
				}
			}
			
			//FACTORIAL OF A GIVEN NUMBER
			int fact=1;

			Scanner s=new Scanner(System.in);
			System.out.println("Enter a numver to calculate the factorial of it");
			
			int num=s.nextInt();
			for (int i=1;i<=num;i++)
			{
				fact = fact * i;
				
			}
			System.out.println("factorial of "+ num+" is "+fact);
			
			//REVERSE OF A NUMBER
			
			

			System.out.println("Enter a number to find reverse of it");
			
			int numb=s.nextInt();
			int temp=numb;
			int rev=0,rem;
			while(numb!=0)
			{
				rem=numb%10;
				
				rev=rev*10+rem;
				numb/=10;
				
			}
			System.out.println("reverse of "+temp+" is "+rev);
			
			//PALINDROME OR NOT

			if(temp==rev)
			{
				System.out.println(temp+"is  palindrome");
				
			}
			else 
			{
			System.out.println(temp+"is not a palindrome");
			}
			
			//PRIME NUMBER OR NOT
			
			int p,count=0;
			System.out.println("enter a number to check whether it is prime or not");
			p=s.nextInt();
			for (int i=1;i<=p;i++)
			{
				if(p%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(p+"is a prime number ");
			}
			else
			{
				System.out.println(p+"is not a prime number");
			}
			//PRIME NUMBERS FROM 1-100
			
			for (int i=2;i<100;i++)
			{
				int count1=0;


				for(int j=1;j<=i;j++) 
				{
				if(i%j==0)
				{
					count1++;
				}
				}
			
			
			   if(count1==2)
			{
				System.out.println(i+"is a prime number ");
			}
			else
			{
				System.out.println(i+"is not a prime number");
			}
			}

			
			//	ARMSTRONG NUMBER OR NOT
			
			int sum=0,c=0;
			Scanner s=new Scanner(System.in);
			System.out.println("enter a number to check whether it is armstrong or not");
			int num=s.nextInt();
			int temp=num;
			while(num!=0)
			{
				int rem=num%10;
				sum=sum+(rem*rem);
				num/=10;
			}
			if(sum==temp)
			{
				System.out.println(temp+"is an armstrong number");
			}
			else 
			{
				System.out.println(temp+"is not an armstrong number");
			}
		
			
		
		//FIBANOCCI SERIES
		
System.out.print("Enter the number of terms in the Fibonacci series: ");

        Scanner sc=new Scanner(System.in);
       
        int n = sc.nextInt();

        System.out.println("Fibonacci series:");

        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) 
        {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        System.out.print("Enter the number of terms in the Fibonacci series: ");

        
        int n = scanner.nextInt();

       
        scanner.close();

      
        System.out.println("Fibonacci series:");

        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

	}

        //PRINT THE RIGHT ANGLED TRIANGLE PATTERN
        System.out.println("Enter the number of rows to print the pattern");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        

        for (int i=1;i<=t;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(j);
        	}
        	System.out.println();
        }

		
		// PRINT * PATTERN IN RIGHT ANGLED TRIANGLE
		
		 System.out.println("Enter the number of rows to print the pattern");
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        

	        for (int i=1;i<=t;i++)
	        {
	        	for(int j=1;j<=i;j++)
	        	{
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	        
		
		//BINARY FORMAT OF A GIVEN NUMBER
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number to calculate binary format of it");
		int num=s.nextInt();
		int a[]=new int[10];
		int k=0;
		
		
		while(num!=0) {
			
			int digit=num%2;
			a[k]=digit;
			num/=2;
			k++;
			
		}
		for(int i=k-1;i>=0;i--)
		{
		System.out.print(a[i]);
	}

			        */
	
	}
}
	        



	
	

	
	

