package jp.kenschool.chapter7;

public class CallThreadTest {

	public static void main(String[] args) {
		System.out.println("Thread Start");
		ThreadTest threadTest = new ThreadTest();
		threadTest.start();
		try {
			threadTest.join();
		}
		catch(InterruptedException e) {}
		System.out.println("Thread End");
	}

}
