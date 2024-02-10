package Com;

import java.util.Scanner;

public class ConversionData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int km,cm;
		System.out.println("Do you want to convert from KB to GB?");
		String Response=s.next();
		if(Response.equals("Yes"))
		{
			System.out.println("How many seconds?");
			cm=s.nextInt();
			System.out.println("MB:"+(cm/1000.0));
			System.out.println("GB:"+(cm/1e+6));
		}
		else if(Response.equals("No")) {
			System.out.println("How many GB?");
			km=s.nextInt();
			System.out.println("MB:"+(km*1000));
			System.out.println("KB:"+(km*1e+6));
			
		}
		else
			System.out.println("Enter Proper input");
	}

}
