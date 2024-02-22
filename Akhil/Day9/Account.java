//discuseed on day 9 and day 10
// day 9 on methods
// day 10 on constructors
package learning.Day9;

public class Account {
    int accnum;
    String name;
    private double balance;//private variables cannot be accesed outside of the calss
    long phone;
    String address;

    Account(){
        System.out.println("this is a constructer and it called when the objectv is created");
        accnum =12342354;
        name="akhil";
        address="addr1";
        phone=1112122;
        balance=10000000;
    }

    Account(int t,String s,String a,long p,double b){//constructor is called only once for an object
        System.out.println("this is a constructer and it called when the objectv is created");
        accnum =t;
        name=s;
        address=a;
        phone=p;
        balance=b;
    }

    //method
    void callme(){
        System.out.println("i am a method");
        System.out.println("i can have n lines of code");
        System.out.println("i can be called by object of the class");
    }

    void getdetails(){
        System.out.println(accnum);
        System.out.println(name);
        System.out.println(balance);
        System.out.println(phone);
        System.out.println(address);
    }

    void withdraw(double amount){//now we give the desire value we want to withdraw
        balance=balance-amount;
        System.out.println("after withdrwal balance : "+balance);
    }

    void deposit(double amount){
        balance=balance+amount;
        System.out.println("after the deposit : "+balance);
    }

    void createaccount(int accnum1,String name1,String address1,long phone1,int balance1){
        accnum =accnum1;
        name=name1;
        address=address1;
        phone=phone1;
        balance=balance1;

    }
    double getbalnce(){//we should mention the datatype which we are returning
        System.out.println("existing balance : "+balance);
        return balance;
        //System.out.println("returned the balnce");// not allowed return should be the last statement
    }


}
