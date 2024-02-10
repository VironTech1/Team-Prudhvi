package setFour;

public class WaterBottle {

	
	    private double capacity;
	    private double waterLevel;

	    public WaterBottle(double capacity) {
	        this.capacity = capacity;
	        this.waterLevel = 0; // Initially, the bottle is empty
	    }

	    public void fill(double amount) {
	        if (waterLevel + amount <= capacity) {
	            waterLevel += amount;
	            System.out.println("Water filled. Current water level: " + waterLevel);
	        } else {
	            System.out.println("Cannot fill. Exceeds bottle capacity.");
	        }
	    }

	    public void sip(double amount) {
	        if (waterLevel >= amount) {
	            waterLevel -= amount;
	            System.out.println("Sipped " + amount + " units of water. Current water level: " + waterLevel);
	        } else {
	            System.out.println("Not enough water to sip.");
	        }
	    }

	    public void empty() {
	        waterLevel = 0;
	        System.out.println("Bottle emptied. Current water level: " + waterLevel);
	    }

	    public static void main(String[] args) {
	        WaterBottle bottle = new WaterBottle(100.0); // Bottle capacity is 100 units

	        // Perform actions: Fill, Sip, Empty
	        bottle.fill(50.0);
	        bottle.fill(70.0); // Attempting to exceed the capacity
	        bottle.sip(30.0);
	        bottle.sip(50.0); // Attempting to sip more than available
	        bottle.empty();
	    }
	}

