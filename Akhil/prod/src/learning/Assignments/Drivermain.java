package learning.Assignments;
import java.util.*;

public class Drivermain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Driver d=new Driver();
        System.out.print("the name of the driver is : ");
        d.name=sc.next();
        System.out.println("the name of the car is : ");
        d.car=sc.next();
        System.out.println("what's the speed : ");
        d.Speed=sc.nextInt();

        d.drives(d.name,d.car,d.Speed);
    }
}
