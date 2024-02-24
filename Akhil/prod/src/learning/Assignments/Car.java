//day 13 assignment
//1. Car has speed and it can be changed by acceleration and applying break.
//day 13
package learning.Assignments;
import java.util.*;
public class Car {

    Scanner sc=new Scanner(System.in);

    String acc;
    int Break;
    void speed(int s){
        if(s==0){
            System.out.println("you have applied breaks so the vechile is stopping now\n hmmmmm..... it stoped");
        }
        else if(s==1){
            System.out.print("you have opted to accelarate so now enter how much do you want to accelerate : ");
            acc=sc.nextInt()+"";

            //Integer.toString(0)//we can use this to convert integrer to string




            if(0==Integer.parseInt(acc)){//it is used to convert string to int
                System.out.println("you could have opted to stop the vechile \n by applying breaks 'just saying' ");

            }
            else {

                System.out.println("you have Accelerated to the speed of " + acc + "mps vechile as started to accelerate\n hmmm...yup now it is at the required speed");
            }

        }
    }
}
