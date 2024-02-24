package InheritanceAssignment;

public class Waterbottle {
     double capacity;
     double waterLevel;

    public Waterbottle(double capacity) {
        this.capacity = capacity;
        this.waterLevel = 0.0;
    }

    public void fill(double amount) {
        if (amount > 0) {
            if (waterLevel + amount <= capacity) {
                waterLevel += amount;
                System.out.println("Bottle filled. Current water level: " + waterLevel);
            } else {
                System.out.println("Cannot fill. Exceeds bottle capacity.");
            }
        } else {
            System.out.println("Invalid fill amount. Please enter a positive amount.");
        }
    }

    public void sip(double amount) {
        if (amount > 0) {
            if (waterLevel >= amount) {
                waterLevel -= amount;
                System.out.println("Sipped water. Current water level: " + waterLevel);
            } else {
                System.out.println("Insufficient water to sip.");
            }
        } else {
            System.out.println("Invalid sip amount. Please enter a positive amount.");
        }
    }

    public void empty() {
        waterLevel = 0.0;
        System.out.println("Bottle emptied. Current water level: " + waterLevel);
    }

    public void displayWaterLevel() {
        System.out.println("Current Water Level: " + waterLevel);
    }
}

