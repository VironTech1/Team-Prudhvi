//day 13
//3. Mobile has balance and it can be changed by recharging and making calls.
package learning.Assignments;

public class mobile {
    balance balance1;


    int makingcalls;

    void netbalance(int netbalance1,int makingcalls1,int balance1recharging){//lets say ecah call cost 10rs
        int n=(netbalance1-(makingcalls1*10)+balance1recharging);
        System.out.println("the netbalnce is : "+n);


    }


}




class balance {

    int recahrging;
}