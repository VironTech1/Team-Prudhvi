package feb_7;

import java.util.Scanner;

public class strmanip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		String rev=reverseString(str);
		System.out.println("Reversed String is "+rev);
		
		if(str.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
	
	static String reverseString(String str)
	{
		String rev=new String();
		
		int n=str.length();
		
		for(int i=n-1;i>=0;i--)
		{
			rev+=""+str.charAt(i);
		}
		
		return rev;
		
	}

}
