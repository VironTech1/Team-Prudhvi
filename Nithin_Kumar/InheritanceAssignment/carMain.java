package InheritanceAssignment;

public class carMain extends car{
	 public static void main(String[] args) {
	        car myCar = new car();
	        myCar.accelerate(30);
	        System.out.println("Current speed: " + myCar.getSpeed());
		
	}

}
