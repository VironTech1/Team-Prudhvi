package StringAssignment;

public class palindrome {
	
	public static void main(String[]args) {
		String s ="nitin";
		Boolean isPalindrome = true;
		for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
		if (isPalindrome) {
            System.out.println(s + " is a palindrome.");
        } 
		else {
            System.out.println(s + " is not a palindrome.");
        }
	}

}
