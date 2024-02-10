package Assignments.Jan23;

import java.util.Scanner;

public class Average {

	
public static void main(String[] args) {
		
		System.out.println("enter three integer numbers a , b and c to perform average");
		
		Scanner sc= new Scanner(System.in);
		
		int a =sc.nextInt();
		
		int b =sc.nextInt();

        int c =sc.nextInt();

        double avg =(a+b+c)/3;
        
        System.out.println("Avrage of a ,b and c is :" + avg);
}
        
}
