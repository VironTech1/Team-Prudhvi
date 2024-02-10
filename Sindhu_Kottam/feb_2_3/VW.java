package feb_2_3;

public class VW extends Car{
	
	void accelerate(int speed)
	{
		System.out.println("Yov've hit accelerator now the speed is "+(speed+10));
	}
	
	void brakes()
	{
		System.out.println("You've hit brakes");
	}

}
class Honda extends Car{
	
	void accelerate(int speed)
	{
		System.out.println("Yov've hit accelerator now the speed is "+(speed+15));
	}
	
	void brakes()
	{
		System.out.println("You've hit brakes");
	}
	
	

}