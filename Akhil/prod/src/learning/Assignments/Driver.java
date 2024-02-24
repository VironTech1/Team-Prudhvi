//day 13 assighnment
//6. Driver drives the car and car moves.
package learning.Assignments;

public class Driver {
    String name;
    String car;
    int Speed;

    void drives(String name1,String car1,int Speed1){
        name=name1;
        car = car1;
        Speed=Speed1;
        System.out.println(name1+" started the"+car1+"  at the speed of "+Speed1);
    }
}
