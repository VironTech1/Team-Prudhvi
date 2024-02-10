public class FindCharacter {

    public static char findChar(String str, int index) {
        return str.charAt(index);
    }

    public static void main(String[] args) {
        String str = "hello";
        int index = 2;
        System.out.println(findChar(str, index));
    }
}
