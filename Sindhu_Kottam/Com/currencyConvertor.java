package Com;

import java.util.Scanner;

public class currencyConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int amt;
		System.out.println("Enter input currency country \n1.India \n2.USA \n3.UK");
		int ccode=sc.nextInt();
		if(ccode==1) {
		System.out.println("Enter Amount");
		amt=sc.nextInt();
		System.out.println("US Dollar:"+amt/83.16);
		System.out.println("UK Pound:"+amt/105.59);
		}
		else if(ccode==2) {
			System.out.println("Enter Amount");
			amt=sc.nextInt();
			System.out.println("Indian Rupee:"+amt*83.16);
			System.out.println("UK Pound:"+amt*0.79);
			}
		else if(ccode==3) {
			System.out.println("Enter Amount");
			amt=sc.nextInt();
			System.out.println("US Dollar:"+amt/0.79);
			System.out.println("Indian Rupee:"+amt*105.59);
			}
		else
			System.out.println("Enter valid input");
		
	}

}
