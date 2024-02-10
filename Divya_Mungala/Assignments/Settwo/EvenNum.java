package Settwo;

public class EvenNum {

	public static void main(String[] args) {

        int[]  numbers = { 22,1,56,78, 34,33};
        
        System.out.println("Even numbers from the list of arrays are: ");
        
      
        for (int i = 0; i < numbers.length; i++) {
        	
            if (numbers[i] % 2 == 0) {
            	
                System.out.println(numbers[i]);
        	}
        }
        	
        		
    }
        
        
        

}


