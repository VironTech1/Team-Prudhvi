package learning.Day28;



public class SynchronizedEx_CountThread extends Thread{
    private int value =0;

    public synchronized int getValue(){
        System.out.println(Thread.currentThread().getName()+" getValue Method Started");

        return value;
    }
    public synchronized void run(){
        System.out.println(Thread.currentThread().getName()+" Run Method Started");
        System.out.println(Thread.currentThread().getName()+" sleeping");
        try{
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" woke up and calculating");
            for(int i=0;i<=10000;i++){
                value=value+i;

            }
        }

        catch (Exception e){

        }
        System.out.println(Thread.currentThread().getName()+" Run Method Completed"+value);


    }

    public static void main(String[] args) {
        SynchronizedEx_CountThread ct=new SynchronizedEx_CountThread();
        ct.start();
        System.out.println("the sum of first 10000 numbers id "+ct.getValue());
        System.out.println("the sum of first 10000 numbers is "+ct.getValue());
        System.out.println("the sum of first 10000 numbers is "+ct.value);
    }


}
