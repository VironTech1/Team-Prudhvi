//day 15 in class
//Static keyword
package learning.Day15;

public class Staticex{

    static String message = "i am static string";
    public static void main(String[] args) {//the main method will be executed after the static method
        Staticex se=new Staticex();
        System.out.println(se.message);
        se.callme();//here i called the callmethod

        System.out.println("this is main "+message);


    }
    static {//the static method is executed first
        System.out.println("this is static "+message);
    }
    public static void callme(){//this callme method will be executed when we call it
        System.out.println("call me static method");
        Staticex ex=new Staticex();

        //ex.callme();//it will create an infinite looop not possible
    }
}
