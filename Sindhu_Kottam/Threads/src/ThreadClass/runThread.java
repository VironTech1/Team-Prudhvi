package ThreadClass;

public class runThread extends Thread {

    @Override
	public void run() {
        System.out.println("My thread " + Thread.currentThread().getId() + " is running");
    }

    public static void main(String[] args) {
        // Creating and starting a single thread
        runThread t = new runThread();
        t.start();

        // Creating and starting multiple threads in a loop
        for (int i = 0; i < 10; i++) {
            runThread t1 = new runThread();
            t1.start();
        }
    }
}
