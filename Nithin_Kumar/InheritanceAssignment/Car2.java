package InheritanceAssignment;

public class Car2 {
	 String model;
	    int speed;

	    public void move() {
	        System.out.println(model + " is moving at a speed of " + speed + " km/h");
	    }

	    public void accelerate(int acceleration) {
	        speed += acceleration;
	        System.out.println(model + " is accelerating. Current speed: " + speed + " km/h");
	    }

	    public void brake(int brakeForce) {
	        speed -= brakeForce;
	        if (speed < 0) {
	            speed = 0;
	        }
	        System.out.println(model + " is braking. Current speed: " + speed + " km/h");
	    }

}