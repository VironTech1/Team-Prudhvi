package ThreadInterface;

public class runThread implements Runnable {

	@Override
	public void run()
	{
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
            runThread t1 = new runThread();



        }

	}

}
