package InheritanceAssignment;

import java.util.Scanner;

public class WaterbottleMain extends Waterbottle {
    public WaterbottleMain(double capacity) {
		super(capacity);
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the water bottle: ");
        double bottleCapacity = scanner.nextDouble();

        Waterbottle myBottle = new Waterbottle(bottleCapacity);

        int choice;
        do {
            System.out.println("\nWater Bottle Controller Menu:");
            System.out.println("1. Fill Bottle");
            System.out.println("2. Sip Water");
            System.out.println("3. Empty Bottle");
            System.out.println("4. Display Water Level");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter fill amount: ");
                    double fillAmount = scanner.nextDouble();
                    myBottle.fill(fillAmount);
                    break;
                case 2:
                    System.out.print("Enter sip amount: ");
                    double sipAmount = scanner.nextDouble();
                    myBottle.sip(sipAmount);
                    break;
                case 3:
                    myBottle.empty();
                    break;
                case 4:
                    myBottle.displayWaterLevel();
                    break;
                case 0:
                    System.out.println("Exiting Water Bottle Controller. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}