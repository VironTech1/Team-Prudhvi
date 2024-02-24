package learning.Assignments;
import java.util.*;

public class Carmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car c=new Car();
        System.out.print("do you want to accelerate the car or do you want to stop it\n incase you want to stop it type '0' or if you accelarate press '1'");
        c.Break=sc.nextInt();
        c.speed(c.Break);

    }
}
