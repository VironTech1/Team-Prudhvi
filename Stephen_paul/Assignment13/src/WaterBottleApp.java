
		abstract class WaterBottle {
		    protected int capacity;
		    protected int waterLevel;

		    public WaterBottle(int capacity) {
		        this.capacity = capacity;
		        this.waterLevel = 0;
		    }

		    abstract void fill(int amount);

		    abstract void sip(int amount);

		    abstract void empty();

		    void displayWaterLevel() {
		        System.out.println("Water Level: " + waterLevel + " ml");
		    }
		}

		class BasicBottle extends WaterBottle {
		    public BasicBottle(int capacity) {
		        super(capacity);
		    }

		    @Override
		    void fill(int amount) {
		        waterLevel = Math.min(waterLevel + amount, capacity);
		        System.out.println("Bottle filled by " + amount + " ml");
		    }

		    @Override
		    void sip(int amount) {
		        waterLevel = Math.max(waterLevel - amount, 0);
		        System.out.println("Sipped " + amount + " ml. Remaining water: " + waterLevel + " ml");
		    }

		    @Override
		    void empty() {
		        waterLevel = 0;
		        System.out.println("Bottle emptied.");
		    }
		}

		public class WaterBottleApp {
		    public static void main(String[] args) {
		        BasicBottle myBottle = new BasicBottle(1000);
		        myBottle.displayWaterLevel();

		        myBottle.fill(500);
		        myBottle.displayWaterLevel();

		        myBottle.sip(200);
		        myBottle.displayWaterLevel();

		        myBottle.empty();
		        myBottle.displayWaterLevel();
		    }
		}


