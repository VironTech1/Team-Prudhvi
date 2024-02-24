//4. Water bottle has capacity and water level.
//   Water level can be changed by filling, sipping and emptying.
//Make sure that water level can't cross bottle capacity when filling and
// it should be reduced by sipping and emptying. Check all conditions and write program.
package learning.Assignments;
import java.util.*;

public class Waterbottle {

    Scanner sc=new Scanner(System.in);
    capacity c;
    waterlevel wl;



    void check(int i,int j,int k,int o){


        if(i>=j){
            System.out.println("the water level after sipping reduced to "+k);
            System.out.println("the water level after sipping and  emptying reduced to "+o);
            System.out.println("the current level of water in the water bottel after filling it up  is : "+j);
        }
        else{
            System.out.println("water is overflowing there is more water than the bottle capacity");
        }
    }
}
class capacity{
    int calimit;

}
class waterlevel{

    int currentlevel;

    int filling;
    int sipping;
    int emptying;

}
