package practice;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
	Scanner Scanner = new Scanner(System.in);
	
	System.out.println("enter a new number: ");
	int num = Scanner.nextInt();
	
	if(num %2==0) 
	{
		System.out.println("Given number is Even number ");
	}
	else 
	{
		System.out.println("Given number is Odd number ");
	}
	
	}

}
