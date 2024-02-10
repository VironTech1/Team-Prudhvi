import java.util.Scanner;
public class RectanglePerimeter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the Rectangle:");
		double rectangleLength = scanner.nextDouble();
		
		System.out.println("Enter the breadth of the Rectangle:");
		double rectangleBreadth = scanner.nextDouble();
		
		double rectangleArea = rectangleLength * rectangleBreadth;
		double rectanglePerimeter = 2 * (rectangleLength * rectangleBreadth);
		System.out.println("rectangleArea  " + rectangleArea + "  Perimeter  " + rectanglePerimeter);
		
		scanner.close();
	}

}
