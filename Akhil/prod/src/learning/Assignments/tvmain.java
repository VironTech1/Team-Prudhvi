package learning.Assignments;
import java.util.*;

public class tvmain {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        tv tv1 = new tv();
        channel c = new channel();
        volume v = new volume();
        tv1.volume1=v;
        tv1.channel1=c;
        System.out.print("if you want to cahnge the cahnnel press 1 or else 0");
        int i=sc.nextInt();
        System.out.print("if you want to cahange the voilume press 1 or else 0");
        int j=sc.nextInt();
        tv1.change(i,j);


    }


}
