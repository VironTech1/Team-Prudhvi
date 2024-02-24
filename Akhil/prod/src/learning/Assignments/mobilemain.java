//day 13
//3. Mobile has balance and it can be changed by recharging and making calls.

package learning.Assignments;
import java.util.*;

public class mobilemain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the current balance : ");
        int currentbalance=sc.nextInt();
        mobile m = new mobile();
        balance b = new balance();
        m.balance1=b;
        System.out.println("enter the recharging amount : ");
        b.recahrging= sc.nextInt();
        System.out.println("enter the no of calls made : ");
        m.makingcalls= sc.nextInt();
        m.netbalance(currentbalance, m.makingcalls,b.recahrging);
    }
}
