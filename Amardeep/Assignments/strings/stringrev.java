package strings;
import java.util.Scanner;
public class stringrev {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter the string ");
		String str=sc.nextLine();
        int length=str.length();
        String  rev="";		

        for(int i=str.length()-1;i>=0;i--)
		{
		rev+=str.charAt(i);	
		}
		System.out.println("Reverse of String str is "+rev);
		
		
		//Palindrome  or not
		
		if(str.equals(rev))
		{
			System.out.println("Str is palindrom");
		}
		else
		{
			System.out.println("Str is not palindrome");
		}
		
		/*Substring or not
		
		System.out.println("Enter a string ");
		String s1=sc.nextLine();
		
		if(str.contains(s1))
		{
		System.out.println("S1 is a sub string of Str");
	    }
		else
		{
			System.out.println("S1 is not a substring of Str");
		}
		*/
		
		//split a string using split method
		
		String[] splitstr= str.split("a");
		 for (int i=0;i<splitstr.length;i++)
		 {
			 System.out.println(splitstr[i]);
		 }
		 
		 //Spliting by length
		 
			System.out.println("Spliting the Str in half  :"+str.substring((str.length())/2));
			
			
			//Password
			int c;
			boolean  b=false;
			System.out.println("Enter the password");
			String password = sc.nextLine();
			for (int i=0;i<password.length();i++)
			{
				c=password.charAt(i);
				if((c>=65 && c<=90) && (c>=33 && c<=126) )
				{
					b=true;
				}
				
			}
			if (b==true)
			{
				System.out.println("paasword is strong");
			}
			else
			{
				System.out.println("Password is not strong");
			}
	}
	}


