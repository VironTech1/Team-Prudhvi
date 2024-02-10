import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the average marks:");
		        double averageMarks = scanner.nextDouble();

		        char grade = calculateGrade(averageMarks);

		        System.out.println("Grade: " + grade);

		        scanner.close();
		    }

		    private static char calculateGrade(double averageMarks) {
		        if (averageMarks >= 90) {
		            return 'D'; // Distinction
		        } else if (averageMarks >= 80) {
		            return 'F'; // First
		        } else if (averageMarks >= 70) {
		            return 'S'; // Second
		        } else if (averageMarks >= 60) {
		            return 'T'; // Third
		        } else {
		            return 'U'; // Ungraded
		        }
		    }
		

	}


