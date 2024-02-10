package feb_7;

import java.util.Scanner;

public class chatAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String ;");
		String str=sc.next();
		int n=str.length();
		System.out.println("Enter index for string");
		int i=sc.nextInt();
		char c=' ';
		if(i>=n || i<0)
		{
			System.out.println("range out of bounds");
		}
		else
		{
			c=str.charAt(i);
			System.out.println("character at given index is "+c);
		}
			
		
	}

}
