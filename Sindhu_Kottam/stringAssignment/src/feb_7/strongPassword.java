package feb_7;

import java.util.Scanner;

public class strongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter username");
		String uname=sc.next();
		
		System.out.println("Enter password");
		String pwd=sc.next();
		boolean a=false,b=false;
		for(int i=0;i<pwd.length();i++)
		{int val=pwd.charAt(i);
			if(val<=64 && val>=33)
				a=true;
			if(val>64 && val<=96)
				b=true;
		}
		if(a==true && b==true)
		System.out.println("Strong password!!");
		else
			System.out.println("Try again ");
	}

}
