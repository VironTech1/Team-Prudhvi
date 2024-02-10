package setFour;


	
	public class Driver {
	    private String name;

	    public Driver(String name) {
	        this.name = name;
	    }

	    public void drive(Car car) {
	        System.out.println(name + " is driving the car.");
	        car.move();
	    }

	    public static void main(String[] args) {
	        Driver driver = new Driver("John");
	        Car car = new Car("Toyota");

	        driver.drive(car);
	    }
	}

	 class Car {
	    private String model;

	    public Car(String model) {
	        this.model = model;
	    }

	    public void move() {
	        System.out.println(model + " is moving.");
	    }
	}


