package learning.Day26;

public class UserdefinedThreadsEx implements Runnable {
    public void run(){
        //int j=10/0;
        for (int i=0;i<=100;i++){
            System.out.println("run method "+i);
        }
    }
    public static void main(String[] args) {
        UserdefinedThreadsEx udt=new UserdefinedThreadsEx();
        Thread t=new Thread(udt);
        t.start();

        //udt.start();
        Runnable r1=new UserdefinedThreadsEx();
        Thread t1=new Thread(r1);
        t1.run();

        for (int i=0;i<=100;i++){
            System.out.println("main method "+i);
        }
    }
}
