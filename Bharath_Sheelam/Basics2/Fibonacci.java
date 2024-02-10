package Assignment3;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;

        for (int i = 0; i<=6; i++){
            System.out.println(x);
            int z = x+y;

            x = y;
            y = z ;
        }
    }
}
