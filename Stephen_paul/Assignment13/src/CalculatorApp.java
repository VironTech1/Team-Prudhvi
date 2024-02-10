
		abstract class Calculator {
		    abstract int add(int num1, int num2);

		    abstract int subtract(int num1, int num2);
		}

		class BasicCalculator extends Calculator {
		    @Override
		    int add(int num1, int num2) {
		        return num1 + num2;
		    }

		    @Override
		    int subtract(int num1, int num2) {
		        return num1 - num2;
		    }
		}

		public class CalculatorApp {
		    public static void main(String[] args) {
		        BasicCalculator myCalculator = new BasicCalculator();

		        System.out.println("Addition: " + myCalculator.add(10, 5));
		        System.out.println("Subtraction: " + myCalculator.subtract(10, 5));
		    }
		}

