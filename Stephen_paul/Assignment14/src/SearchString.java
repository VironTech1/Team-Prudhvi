

public class SearchString {

    public static boolean search(String str, String target) {
        return str.contains(target);
    }

    public static void main(String[] args) {
        String str = "hello world";
        String target = "world";
        System.out.println(search(str, target));
    }
}
