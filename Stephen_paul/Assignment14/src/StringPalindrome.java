
public class StringPalindrome {

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }
}
