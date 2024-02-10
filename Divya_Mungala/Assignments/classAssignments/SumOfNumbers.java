package classAssignments;

public class SumOfNumbers {

	public static void main(String[] args) {
	
		int Result = addNumbers(3,6);
		double Result1 = addNumbers(3.6, 6.6);
		int Result2 = addNumbers(3,4,6);
		String Result3 = add("Java","is", "awesome!");
		
		
		System.out.println("Result : " + Result);
		System.out.println("Result1 : " + Result1);
		System.out.println("Result2 : " + Result2);
		System.out.println("Result3: " +Result3);
	}

	public static int addNumbers(int a, int b){
	
     return a+b;
	}   

	public static double addNumbers(double a, double b){
		
	     return a+b;
}
	public static int addNumbers(int a, int b, int c){
		
	     return a+b+c;    
}
	 public static String add(String a, String b, String c) {
		 
        return a + b + c;
		
}
}
