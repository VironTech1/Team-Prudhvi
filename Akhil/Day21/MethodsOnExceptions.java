package learning.Day21;

public class MethodsOnExceptions {
    public static void main(String[] args) {
        int a=2;
        int b=0;

        try{
            int i=a/b;
            System.out.println("the value of i is :"+i );
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());//yes we can call methods on objects created by exceptions
            System.out.println(ae.fillInStackTrace());
            System.out.println(ae.getCause());
            System.out.println(ae.getLocalizedMessage());
            System.out.println(ae.getStackTrace());
            System.out.println(ae.getSuppressed());
            System.out.println(ae.getClass());
            //System.out.println(ae.callme());//we cannot call this method
            //if we try to then qwe will get
            //java: cannot find symbol
            //symbol:   method callme()
            //location: variable ae of type java.lang.ArithmeticException

            System.out.println("an arithmetic exception is caught");

        }


    }
    void callme(){
        System.out.println("i am a call me method\n just checking whether we can be called on exception objects or not");


    }
}
