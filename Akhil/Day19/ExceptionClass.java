package learning.Day19;
import java.util.Scanner;

public class ExceptionClass {
    Scanner sc=new Scanner(System.in);
    void example(){
        try{
            System.out.println("enter a number you want to divide 100 by it");
            //as one of the input try to give zero.
            int div=sc.nextInt();
            int res=100/div;
            System.out.println("the result of dividing 100 by "+div+" is:"+res);
        }
        catch(Exception e){
            System.out.println("the progrmae is aborted with: "+e);
        }
        finally {
            System.out.println("final block");
        }
    }
}
