package Assignments;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the marks");
		marks = s.nextInt();
		if(marks>=90) {
			System.out.println("the student passed with Distinction");
		}
		else if(marks<90 && marks>=80){
			System.out.println("the student passed with First Class");
		}
		else if(marks<80 && marks >=70) {
			System.out.println("The student passed with second class");
		}
		else {
			System.out.println("the student passed with third Class");
		}
		s.close();
		

	}

}
