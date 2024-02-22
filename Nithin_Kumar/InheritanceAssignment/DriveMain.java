package InheritanceAssignment;

public class DriveMain {
	public static void main(String[] args) {
        Car2 myCar = new Car2();
        myCar.model = "Toyota";

        Drive myDriver = new Drive();
        myDriver.name = "John";

        myDriver.drive(myCar);

        myCar.accelerate(30);
        myCar.brake(10);
    }

}
