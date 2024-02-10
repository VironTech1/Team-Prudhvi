import java.util.Scanner;
//Sn = n(n+1)/2
public class Natural {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Sc.nextInt();
        float answer = n * (n + 1) / 2;
        System.out.println(answer);
    }
}