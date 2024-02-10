package Com;

import java.util.Scanner;

public class ConversionWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int km,cm;
		System.out.println("Do you want to convert from milligrams to Kgs?");
		String Response=s.next();
		if(Response.equals("Yes"))
		{
			System.out.println("How many Mgs?");
			cm=s.nextInt();
			System.out.println("Grams:"+(cm/1000.0));
			System.out.println("Kilo Grams:"+(cm/1e+6));
		}
		else if(Response.equals("No")) {
			System.out.println("How many Kgs?");
			km=s.nextInt();
			System.out.println("Grams:"+(km*1000));
			System.out.println("Milli Grams:"+(km*1e+6));
			
		}
		else
			System.out.println("Enter Proper input");
	}

}
