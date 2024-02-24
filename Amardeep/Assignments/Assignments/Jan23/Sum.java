package Assignments.Jan23;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		
		System.out.println("enter two integer numbers a and b to perform addition");
		
		Scanner sc= new Scanner(System.in);
		
		int a =sc.nextInt();
		
		int b =sc.nextInt();
		
		int sum = a+b;
		
		System.out.println("Sum of a and b is :" + sum);
		
	}
}
