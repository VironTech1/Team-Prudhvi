package learning.Day27;


//we wont be getting the right answer for this every time
//when the main thread and the user defined thread use the same data for their functions
//it leads to errors
//because the start method will create a separate memory for the userdefined threads and the value of data will change
//when this executes
//and if the main thread  is executed before the user defined thread then the output will be zero because there is no change in the
//value of data because their is no action performed on it
//here the solution for this is Synchronization

public class CountThread extends Thread{
    private int value =0;

    public int getValue(){

        return value;
    }
    public void run(){
        for(int i=0;i<=10000;i++){
            value=value+i;

        }


    }

    public static void main(String[] args) {
        CountThread ct=new CountThread();
        ct.start();
        System.out.println("the sum of first 10n numbers id "+ct.value);
        System.out.println("the sum of first 10 numbers is "+ct.value);
    }
}
