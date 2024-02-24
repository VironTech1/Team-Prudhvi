package Com;

import java.util.Scanner;

public class ConversionTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int km,cm;
		System.out.println("Do you want to convert from seconds to Hours?");
		String Response=s.next();
		if(Response.equals("Yes"))
		{
			System.out.println("How many seconds?");
			cm=s.nextInt();
			System.out.println("Minutes:"+(cm/60.0));
			System.out.println("Hors:"+(cm/3600.0));
		}
		else if(Response.equals("No")) {
			System.out.println("How many Hours?");
			km=s.nextInt();
			System.out.println("Minutes:"+(km*60));
			System.out.println("Seconds:"+(km*3600));
			
		}
		else
			System.out.println("Enter Proper input");
	}

}
