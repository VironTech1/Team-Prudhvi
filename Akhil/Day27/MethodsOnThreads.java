package learning.Day27;

public class MethodsOnThreads implements Runnable {
    /*public void status(){
        System.out.println(Thread.currentThread().getState());
    }

     */
    public void run(){

        for (int i=0;i<=4;i++){
            /*try {
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }

             */

            System.out.println(Thread.currentThread().getName()+" run method "+Thread.currentThread().getPriority()+"  "+Thread.currentThread().getState()+" Iteration "+ i);
        }
        System.out.println(Thread.currentThread().getState());


    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getState());
        MethodsOnThreads mot=new MethodsOnThreads();
        Thread t=new Thread(mot);
        System.out.println(t.getState());
        System.out.println(t.isAlive());
        t.start();
        t.setPriority(9);
        t.setName("USER DEFINED THREAD 1");
        System.out.println(t.isAlive());
        System.out.println(t.getState());

        Runnable r=new MethodsOnThreads();
        Thread t1=new Thread(r);
        System.out.println(t1.getState());
        t1.start();
        t1.setName("USER DEFINED THREAD 2");
        t1.setPriority(8);
        System.out.println(t1.getState());

        for(int i=0;i<=4;i++){

            Thread.sleep(1000);
            Thread.yield();
            System.out.println(Thread.currentThread().getState()+" MAIN METHOD "+Thread.currentThread().getPriority()+ " " +i);
            t.join();
            t1.join();
        }
        System.out.println(t.getState() +" t ");
        System.out.println(t1.getState()+" t1");
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());
        MethodsOnThreads td=new MethodsOnThreads();
        //td.status();


    }


}
