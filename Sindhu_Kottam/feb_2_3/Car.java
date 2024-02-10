package feb_2_3;

public abstract class Car {
	int speed;
	String model;
	String color;
	

	 abstract void accelerate(int speed);
	
	abstract void brakes();
	
	void display()
	{
		System.out.println("Car-Details");
		System.out.println("Car speed is "+speed);
		System.out.println("Car model is "+model);
		System.out.println("Car color is "+color);
	}
}
