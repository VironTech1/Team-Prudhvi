package abstractclassconcept;

public class Bmw  extends Car{

	@Override
	public void accelerator(int speed) {
		// TODO Auto-generated method stub
		
		System.out.println("BMW accelerated with speed "+(speed+40));
		
		
	}

	@Override
	public void applyBreak(int speed) {
		// TODO Auto-generated method stub
		System.out.println("BMW breaks are applied"+(speed-10));
	}

}
