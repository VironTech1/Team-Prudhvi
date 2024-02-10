package feb_7;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=s.next();
		
		System.out.println("Enter substring to find in the first string");
		String sub=s.next();
		
		if(str.contains(sub))
		{
			System.out.println("yes");
		}
		else
			System.out.println("No");
	}

}
