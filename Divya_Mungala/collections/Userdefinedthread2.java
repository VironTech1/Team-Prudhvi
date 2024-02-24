package collections;



	
	public class Userdefinedthread2 implements Runnable {

	    public void run(){
	        for(int i=1; i<=100; i++) {
	            System.out.println("Run method " + i);
	        }
	    }

	    public static void main(String args[]) {
	        Userdefinedthread2 udt1 = new Userdefinedthread2(); // Corrected: Create an instance of Userdefinedthread2
	        Thread t1 = new Thread(udt1); // Corrected: Pass udt1 as the Runnable target for t1
	        t1.start();

	        Thread t2 = new Thread(udt1); // Create a new thread with the same runnable instance
	        t2.start();

	        for(int i=1; i<=100; i++) {
	            System.out.println("Main method " + i);
	        }

	    }

	}

