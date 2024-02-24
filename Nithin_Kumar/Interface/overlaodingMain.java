package Interface;

public class overlaodingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading ov = new overloading();
		
		int result1 = ov.area(5);
		System.out.println(result1);
		
		int result2 = ov.area(5, 10);
		System.out.println(result2);
		
		double result3 = ov.area(3.14, result2);
		System.out.println(result3);
		

	}

}
