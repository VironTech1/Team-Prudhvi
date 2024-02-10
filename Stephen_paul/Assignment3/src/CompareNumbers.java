import java.util.Scanner;
public class CompareNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of num1");
		int num1 = s.nextInt();
		
		System.out.println("Enter the value of num2");
		int num2 = s.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is greater than num2");
		}else if(num1<num2)
		{
			System.out.println("num2 is greater than num1");
		}
		else
		{
			System.out.println("num1 is greater than num2");
		}
	}

}
