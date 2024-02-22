package learning.Day20;

//public class InvalidPasswordException extends RuntimeException{
public class InvalidPasswordException extends Exception{

    public InvalidPasswordException(){

    }
    public InvalidPasswordException(String messaage){
        super(messaage);

    }

}
