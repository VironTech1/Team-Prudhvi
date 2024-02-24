package learning.Assignments;
import java.util.*;

public class waterbottlemain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Waterbottle wb=new Waterbottle();
        capacity c = new capacity();
        System.out.print("enter the capacity of water bottle : ");
        c.calimit=sc.nextInt();

        waterlevel wl=new waterlevel();
        System.out.print("enter the amount of water that you are emptying : ");
        wl.emptying=sc.nextInt();
        System.out.print("enter the amount of water that you are sipping : ");
        wl.sipping=sc.nextInt();
        System.out.print("enter the amount of water that you are filling : ");
        wl.filling=sc.nextInt();
        System.out.print("enter the current level of water : ");
        wl.currentlevel=sc.nextInt();
        int waterlevel= wl.currentlevel+wl.filling- wl.emptying-wl.sipping;
        System.out.println("the water level right now : "+waterlevel);
        int aftersipping=wl.currentlevel-wl.sipping;
        int afteremptying=wl.currentlevel-wl.emptying- wl.sipping;


        wb.check(c.calimit,waterlevel,aftersipping,afteremptying);
    }
}
