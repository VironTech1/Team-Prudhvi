package practice;
import java.util.Scanner;
public class GradesOfStudent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the average mark: ");
        double AverageMark = scanner.nextDouble();
        
       String grade ;
       
       if (AverageMark >= 90) {
    	  grade = "Distinction"; 
       }else if  (AverageMark >= 80) {
          grade = "First class";
       
       }else if (AverageMark >= 60) {
    	          grade = "Second class";
        
       } else if  (AverageMark >= 50) {
 	          grade = "Third class";
       }
	      else 
		grade= "fail";
       
       System.out.println("The grade for average mark " + AverageMark + " is: " + grade);
       scanner.close();
      
	}

}
