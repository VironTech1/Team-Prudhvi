//discuseed on day 9 and day 10
// day 9 on methods
// day 10 on constructors
package learning.Day9;

import learning.Day9.Account;

public class Accountmain {

    public static void main(String[] args) {
        Account acc1=new Account(1111,"akhil","addr1",786878,1000000);
        /*acc1.accnum =12342354;
        acc1.name="akhil";
        acc1.address="addr1";
        acc1.phone=1112122;
        acc1.balance=100000000;*/

       // acc1.createaccount(1234234,"akhil","addr1",1112122,10000);//made it a comment to work on constructor

        /*System.out.println(acc1.accnum);
        System.out.println(acc1.name);
        System.out.println(acc1.address);
        System.out.println(acc1.phone);
        System.out.println(acc1.balance);*/

        acc1.getdetails();//made it a comment to work on constructor
        //System.out.println(acc1.balance);//it throws an error saying "java: balance has private access in learning.Day9.Account"

        //acc1.balance=acc1.balance-500;
       // System.out.println("after withdrwal balance : "+acc1.balance);
        acc1.withdraw(500);

        //acc1.balance=acc1.balance+70000;
        //System.out.println("after the deposit : "+acc1.balance);
        acc1.deposit(500);




        Account acc2=new Account(32233,"kittu","addr2",88988,3422222);
       /* acc2.accnum =12342364;
        acc2.name="kittu";
        acc2.address="addr2";
        acc2.phone=1112142;
        acc2.balance=100000010;

        */

       // acc2.createaccount(2342364,"kittu","addr2",1112142,100000010);//made it a comment to work on constructor

        /*System.out.println(acc2.accnum);
        System.out.println(acc2.name);
        System.out.println(acc2.address);
        System.out.println(acc2.phone);
        System.out.println(acc2.balance);

         */
        //acc2.getdetails();//made it a comment to work on constructor

        //acc2.balance=acc2.balance-500;
        //System.out.println("after withdrwal balance : "+acc2.balance);
        acc2.withdraw(500);
        //acc1.balance=acc2.balance+70000;
        //System.out.println("after the deposit : "+acc2.balance);
        acc2.deposit(70000);


        Account acc3=new Account(2323,"redddy","addr3",92929393,10999999);
        /*acc3.accnum =12341354;
        acc3.name="reddy";
        acc3.address="addr3";
        acc3.phone=1112123;
        acc3.balance=100000030;

         */

        //acc3.createaccount(12341354,"reddy","addr3",1112123,100000030);//made it a comment to work on constructor


        /*System.out.println(acc3.accnum);
        System.out.println(acc3.name);
        System.out.println(acc3.address);
        System.out.println(acc3.phone);
        System.out.println(acc3.balance);

         */

        //acc3.getdetails();////made it a comment to work on constructor

        //acc3.balance=acc3.balance-500;
        //System.out.println("after withdrwal balance : "+acc3.balance);
        acc3.withdraw(600);
        //acc1.balance=acc3.balance+70000;
        //System.out.println("after the deposit : "+acc3.balance);
        acc3.deposit(40000);
        //check the balance
        double bal=acc1.getbalnce();
        if(bal>20000){
            System.out.println("you can buy A MOBILE");
        }
        else{
            System.out.println("you can't buy a mobile");
        }


    }
}
