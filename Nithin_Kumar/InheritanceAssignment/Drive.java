package InheritanceAssignment;

public class Drive {
	 String name;

	    public void drive(Car2 car) {
	        System.out.println(name + " is driving the " + car.model);
	        car.move();
	    }

}
