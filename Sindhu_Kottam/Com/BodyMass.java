package Com;

import java.util.Scanner;

public class BodyMass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double weight,height;
		double bmi;
		
		System.out.println("Enter your Height in meters");
		height=s.nextDouble();
		System.out.println("Enter your Weight in Kgs");
		weight=s.nextDouble();
		bmi=weight/Math.pow(height, 2);
	    
		if(bmi>=40)
			System.out.println("Obese-very severe");
		else if(bmi>=35 && bmi<40)
			System.out.println("Obese-severe");
		else if(bmi>=30 && bmi<35)
			System.out.println("Obese-moderate");
		else if(bmi>=25 && bmi<30)
			System.out.println("OverWeight");
		else if(bmi>=18.5 && bmi<25)
			System.out.println("Normal Weight");
		else if(bmi<18.5)
			System.out.println("Under Weight");
	    
	    
		
	}

}
