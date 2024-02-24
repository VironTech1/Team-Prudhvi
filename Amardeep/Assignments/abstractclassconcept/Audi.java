package abstractclassconcept;

public class Audi extends Car{

	@Override
	public void accelerator(int speed) {
		// TODO Auto-generated method stub
		
		System.out.println("Audi is accelerated by speed:"+(speed+20));
	}

	@Override
	public void applyBreak(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Audi break is applied"+(speed-5));
	}

	
}
