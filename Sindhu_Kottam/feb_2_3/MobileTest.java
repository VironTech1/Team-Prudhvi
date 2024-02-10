package feb_2_3;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AT_T at=new AT_T();
		at.balance=1;
		at.make_call();
		at.make_recharge(5);
		
		
		Verizon v=new Verizon();
		
		v.balance=0;
		v.make_call();
		v.make_recharge(7);
		
		

	}

}

class AT_T extends Mobile{
	
	void make_call()
	{
		if(balance>1)
		{
			System.out.println("Call is Executed& new balance is "+(balance-1));
		}
		else
			System.out.println("Insufficient Balance");
	}
	
	void make_recharge(int amt)
	{
		System.out.println("Recharged and new balance is "+(balance+amt));
	}
}

class Verizon extends Mobile{
	
	void make_call()
	{
		if(balance>2)
		{
			System.out.println("Call is Executed& new balance is "+(balance-2));
		}
		else
			System.out.println("Insufficient Balance!! please recharge");
	}
	
	void make_recharge(int amt)
	{
		System.out.println("Recharged and new balance is "+(balance+amt));
	}
}

