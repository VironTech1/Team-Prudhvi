//day 13 assignments
//2. Tv has channel and volume and they can be changed by inc/dec volume & channel.

package learning.Assignments;
import java.util.*;

public class tv {

    Scanner sc=new Scanner(System.in);

    channel channel1;
    volume volume1;

    void change(int i,int j){
        if(i==1){
            System.out.println("you have opted to change the channel\n do you want to go to higher channel number or lower\n incase you want higher press '1' if lower press '0'");
            channel1.option1=sc.nextInt();
            if(channel1.option1==1){
                System.out.println("channel is increased");
            } else if (channel1.option1==1) {
                System.out.println("channel is decreased");

            }
            else {
                System.out.println("invalid input\n i will do nothing  bye..");
            }



        } else if (i==0) {
            System.out.println("you do not want to change the channel\n thats good less work for me bye..");

        }
        else{
            System.out.println("invalid input \n i guess you have a lot free time ;) ");
        }
        if(j==1){
            System.out.println("you have opted to change the volume\nnow tell me do you want me to increase it or decrease it\ntype 1 to increase type 0 to decrease");
            volume1.option2=sc.nextInt();
            if(volume1.option2==1){
                System.out.println(" the volunme is increased ");
            } else if (volume1.option2==0) {
                System.out.println("the volume is decreased");
            }else{
                System.out.println("invalid input \n okay i get it enjoy your free time");
            }

        } else if (j==0) {
            System.out.println("you didn't opt to change the volume thank you for less work bye..");
        }else {
            System.out.println("invalid input \n you cloud learn something in your free time 'just saying'");
        }
    }


}

class channel{
    int option1;
}
class volume{
    int option2;
}
