package InheritanceAssignment;

public class car {
	int speed;
	
	
	public car() {
		this.speed = speed;
	}
	
	public void accelerate(int accelerate) {
		speed = speed+accelerate;
		System.out.println("car is speeding"+speed);
	}
	public void brake(int brakeforce) {
		 speed -= brakeforce;
		if(speed>0) {
			speed  = 0;
		}
		System.out.println("brake is applied");
	}
	 public double getSpeed() {
	        return speed;
	    }
	

}
