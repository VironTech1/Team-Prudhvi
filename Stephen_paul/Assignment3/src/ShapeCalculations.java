
public class ShapeCalculations {

	public static void main(String[] args) {
		//circle
		double circleRadius = 5.0;
		double circleArea = Math.PI *circleRadius * circleRadius;
		double circlePerimeter = 2* Math.PI * circleRadius;
		System.out.println("  circleArea  " + circleArea + "  Perimeter  " + circlePerimeter);
		//square
		double squareSide = 4.0;
		double squareArea = squareSide*squareSide;
		double squarePerimeter = 4 * squareSide;
		System.out.println("  squareArea  " + squareArea + "  Perimeter  " + squarePerimeter);
		//Rectangle
		double rectangleLength = 3.0;
		double rectangleBreadth = 2.0;
		double rectangleArea = rectangleLength * rectangleBreadth;
		double rectanglePerimeter = 2 * (rectangleLength * rectangleBreadth);
		System.out.println("  rectangleArea  " + rectangleArea + "  Perimeter  " + rectanglePerimeter);
		//Parallelogram
		double parallelogramBase = 7.0;
		double parallelogramHeight = 6.0;
		double parallelogramArea = parallelogramBase * parallelogramHeight;
		double parallelogramPerimeter = 2 * (parallelogramBase * parallelogramHeight);
		System.out.println("  parallelogramArea  " + parallelogramArea + "  Perimeter  " + parallelogramPerimeter);
		
		

	}

}
