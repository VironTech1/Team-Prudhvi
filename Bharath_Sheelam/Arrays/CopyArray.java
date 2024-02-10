package Assignment2;

public class CopyArray {
    public static void main(String[] args) {
        int[] j = {0, 1, 2};
        int[] a = j;
        System.out.println("The array 'j' is copied into 'a'");
        for (int index = 0; index < a.length; index++) {
            System.out.println(a[index]);
        }
    }
}