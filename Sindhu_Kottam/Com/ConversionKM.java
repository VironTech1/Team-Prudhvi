package Com;

import java.util.Scanner;

public class ConversionKM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int km,cm;
		System.out.println("Do you want to convert from cms to KM?");
		String Response=s.next();
		if(Response.equals("Yes"))
		{
			System.out.println("How many cms?");
			cm=s.nextInt();
			System.out.println("Meters:"+(cm/1000.0));
			System.out.println("Kilo Meters:"+(cm/100000.0));
		}
		else if(Response.equals("No")) {
			System.out.println("How many Kms?");
			km=s.nextInt();
			System.out.println("Meters:"+(km*1000));
			System.out.println("CentiMeters:"+(km*100000));
			
		}
		else
			System.out.println("Enter Proper input");
	}

}
