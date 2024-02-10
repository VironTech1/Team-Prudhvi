package assignments;
import java.util.Scanner;
public class UserInputStringManipulation {

	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a string: ");
	        String userInputString = scanner.nextLine();

	        
	        UserInputStringManipulation example = new UserInputStringManipulation();

	        
	        String reversedString = example.reverse(userInputString);
	        System.out.println("Reversed String: " + reversedString);

	        
	        boolean isPalindrome = example.palindrome(userInputString);
	        System.out.println("Is Palindrome: " + isPalindrome);

	       
	        System.out.print("Enter a substring to search: ");
	        String substringToSearch = scanner.nextLine();
	        boolean containsSubstring = example.search(userInputString, substringToSearch);
	        System.out.println("Contains Substring: " + containsSubstring);

	       
	        System.out.print("Enter an index: ");
	        int indexToCheck = scanner.nextInt();
	        Object characterAtIndex = example.charAtmethod(userInputString, indexToCheck);
	        if (characterAtIndex instanceof Character) {
	            System.out.println("Character at index " + indexToCheck + ": " + characterAtIndex);
	        } else {
	            System.out.println("Invalid index or character not found.");
	        }

	        
	        String[] namesArray = example.splitNames(userInputString);
	        System.out.println("Names: " + String.join(", ", namesArray));

	        
	        System.out.print("Enter a password to check: ");
	        String userPassword = scanner.next();
	        boolean isValidPassword = example.checkPassword(userPassword);
	        System.out.println("Is Valid Password: " + isValidPassword);

	        
	        scanner.close();
	    }

	    String reverse(String st) {
	        String str1 = "";
	        for (int i = st.length(); i > 0; i--)
	            str1 += st.charAt(i - 1);
	        return str1;
	    }

	    boolean palindrome(String st) {
	        String str1 = reverse(st);
	        return str1.equals(st);
	    }

	    boolean search(String string, String substring) {
	        return string.indexOf(substring) != -1;
	    }

	    Object charAtmethod(String str, int index) {
	        if (index >= str.length() || index < 0)
	            return false;
	        else
	            return str.charAt(index);
	    }

	    String[] splitNames(String str) {
	        return str.split(" ");
	    }

	    boolean checkPassword(String password) {
	        String regex = "^(?=.*[!@#$%^&(),.?\":{}|<>])(?=.*[A-Z])(?=.*[0-9]).+$";
	        return password.matches(regex);
	     
	        
	    }
	}

