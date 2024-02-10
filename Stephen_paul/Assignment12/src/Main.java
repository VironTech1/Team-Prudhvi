
		abstract class Car {
		    protected int speed;

		    abstract void accelerate(int increase);

		    abstract void brake(int decrease);

		    void displaySpeed() {
		        System.out.println("Current Speed: " + speed + " mph");
		    }
		}

		class MyCar extends Car {
		    @Override
		    void accelerate(int increase) {
		        speed += increase;
		        System.out.println("Car accelerated by " + increase + " mph");
		    }

		    @Override
		    void brake(int decrease) {
		        speed -= decrease;
		        System.out.println("Car applied brakes. Speed reduced by " + decrease + " mph");
		    }
		}

		public class Main {
		    public static void main(String[] args) {
		        MyCar myCar = new MyCar();
		        myCar.accelerate(20);
		        myCar.displaySpeed();
		        myCar.brake(5);
		        myCar.displaySpeed();
		    }
		}





