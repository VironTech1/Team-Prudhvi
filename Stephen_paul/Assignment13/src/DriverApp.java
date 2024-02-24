
		abstract class Car {
		    abstract void move();
		}

		class Driver {
		    void drives(Car car) {
		        car.move();
		    }
		}

		class BasicCar extends Car {
		    @Override
		    void move() {
		        System.out.println("Car is moving");
		    }
		}

		public class DriverApp {
		    public static void main(String[] args) {
		        Driver driver = new Driver();
		        Car myCar = new BasicCar();

		        driver.drives(myCar);
		    }
		}

