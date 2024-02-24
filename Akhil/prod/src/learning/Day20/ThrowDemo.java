package learning.Day20;
import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args)throws InvalidPasswordException{
        Scanner sc=new Scanner(System.in);
        System.out.println("MAIN START");
        //int i=2/0;//arithmetic exception  thrown by JVM
       // ArithmeticException ae=new ArithmeticException();//an arithmetic exception object is created
        //throw ae;//it will throw  a arithmetic exception//thrown by us
        //System.out.println("MAIN END");//it is unreachable as the exception is thrown before this statement
        System.out.print("please enter your password : ");
        String password=sc.nextLine();
        System.out.println(password.length());
        if(password.length()<8){
            InvalidPasswordException ipe=new InvalidPasswordException("password cant be less than 8 letters");
             throw ipe;
        }
        System.out.println("you are successfully registered ");

    }

}
