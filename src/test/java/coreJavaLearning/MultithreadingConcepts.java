package coreJavaLearning;

public class MultithreadingConcepts extends Thread {

	public synchronized void run() {
		
		for (int i = 0; i < 5 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("starting parentC thread " + i);
			
		}

	}

	public static void main(String[] args) {

		MultithreadingConcepts obj1 = new MultithreadingConcepts();

		obj1.start();
		
		System.out.println("gap between calling ");
		
		MultithreadingConcepts obj2 = new MultithreadingConcepts();

		obj2.start();
	}

}
