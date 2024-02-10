package Com;

import java.util.Scanner;

public class BankApplication {
	long actNo;
	int pin,bal;
	BankApplication()
	{
		actNo=123456789;
		pin=1234;
		bal=5000;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApplication b=new BankApplication();
		Scanner sc=new Scanner(System.in);
		
		boolean state=true;
		int n,pinTried;
		//int n;
		long ac;
		while(state)
		{	
			System.out.println("Enter your bank number");
			ac=sc.nextLong();
				if (ac==b.actNo)
				{
					System.out.println("Enter PIN");
					pinTried=sc.nextInt();
					if(b.pin==pinTried)
					{
					while(state)
					{
											
					System.out.println("Choose: \n1.check balance \n2.deposit \n3.withdraw \n4.cancel ");
					n=sc.nextInt();
					if(n==1)
						{
							System.out.println("Balance of "+ac+" is "+b.bal);
						}
					else if(n==2)
						{	System.out.println("Enter amount to deposit");
						int depAmt=sc.nextInt();
						while(depAmt>0)
							{
								b.bal=b.bal+depAmt;
								System.out.println("updated");
								break;
							}
							System.out.println("ENter vaalid amount");
				
						}
					else if(n==3)
						{
							System.out.println("Enter Amount to withdraw");
							int withAmt=sc.nextInt();
							if(withAmt<b.bal)
							{
								b.bal=b.bal-withAmt;
							}
							else
								System.out.println("Insuffficient funds");
				
						}
			
					else if(n==4)
						{
							state=false;
							System.out.println("Thank you!!");
						}
					else
						System.out.println("Enter valid choice!!");
					}
					}
					else
						System.out.println("Incorrect pin number");
				}
				else
				System.out.println("Incorrect account number");
		
			}
		

	}

}
