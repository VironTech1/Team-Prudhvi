package Com;

import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Student avg mark");
		int marks=s.nextInt();
		
		switch(marks/10)
		{
		case 10:System.out.println("Distinction");
		break;
		case 9:System.out.println("Distinction");
		break;
		case 8:System.out.println("First");
		break;
		case 7:System.out.println("Second");
		break;
		case 6:System.out.println("Third");
		break;
		
		}
	}

}
