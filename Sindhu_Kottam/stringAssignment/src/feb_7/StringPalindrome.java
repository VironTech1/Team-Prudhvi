package feb_7;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String args[]) {
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the string ");
	str=sc.next();
	//System.out.println("str-1 length is"+n);
	StringBuilder str1=new StringBuilder(str);
	StringBuilder rev= new StringBuilder(str1).reverse();
	//System.out.println(str1+" "+rev);
	System.out.println("reverse of the given string is "+rev);
	if((str1.toString()).equals(rev.toString()))
	{
		System.out.println("palindrome");
	}
	
	else
		System.out.println("Not a palindrome");
	
}
}