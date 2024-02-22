package learning.Day20;
//in class
//comments reading order topic 1,2,3...
import java.util.Scanner;//topic 2  strats here..//lets try taking the inputs from the user
public class ExceptionType {
    public static void main(String[] args) {//topic 2
        // we can take the values from the user by using this 'String[]' and 'args' also instead of the Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("main start");
        //System.out.print("enter the value of a : ");
        //int a=sc.nextInt();
        //i am getting an .ArrayIndexOutOfBoundsException when i use args[ ] do not know why?
        int a=Integer.parseInt(args[0]);//here we are taking the inputs from the user
        // with the help nof string array present in the main method
        //System.out.print("enter the value of b : ");
        //int b= sc.nextInt();

        int b=Integer.parseInt(args[1]);//as we know that the string array contains all strings
        //here we are using the Integer.parseInt() to convert the Strings in to integers
        //taking help of a predefined class and its methods.
        System.out.println("a is : "+a+", b is : "+b);

        try{
            //for topic 1
            //int i=100/0;//Arithmetic exception creates an object
            //for topic 2
            int i=a/b;
            System.out.println("the valiue  of i is : "+i);

        }
        /*catch (Exception e){
            System.out.println("this is just an example of what will happen if the catch(Exception e) is the first catch statement");
        }
        *///topic 1 ends here
        catch (NullPointerException npe){//topic 1 starts here -the exception in try block is not NullpointerException
            //so this catch block wouldn't catch the excetion and this leads to exception at the run time
            System.out.println("a Nullpointerexception was caught");
            //we get the output like this
            //main start
            //Exception in thread "main" java.lang.ArithmeticException: / by zero
            //	at learning.Day20.ExceptionType.main(ExceptionType.java:7)
        }
        //but in case you have one more catch statement that catches Arithmetic exceptions then it's all good
        /*catch (ArithmeticException ae){//catches an Arithmetic exception
            System.out.println("an Arithmeticexception was caught");
            //then the output will look like
            //main start
            //an Arithmeticexception was caught
            //main end
        }

         */
        catch (ArrayIndexOutOfBoundsException AI){//topic  2 ..//when we do not give the value for b
            System.out.println("an arrayindexoutofbounds exception is found");
            System.out.println("gives the values for both variables");
        }
        //topic 1 continues...//by now it is clear that we can have multiple catch blocks to catch different exception types
        //but what if we do not know which exception will occur?
        //well we can use the superclass of all the exceptions which is 'Exception'
        /*catch (Exception e){//and this should always be the last catch block as we can catch the exception which
            //does not belong to the catch block exceptions that we have created before this
            //but if this is the first catch block then what will happen?
            //all the exceptions will be caught in the first  catch block itself and the other exception catch blocks
            // won't be used at all-- that is a wrong way of coding compiler throws an error.
            //it shows errors like
            //Exception 'java.lang.NullPointerException' has already been caught--see the commented first catch block
            System.out.println("an Exception is caught ");

        }

         */
        finally{
            System.out.println("i am executed no matter what");
        }
        System.out.println("main end");
    }
}
