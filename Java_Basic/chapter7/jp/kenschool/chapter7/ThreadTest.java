package jp.kenschool.chapter7;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		for (int i =0; i< 5 ; i++) {
			System.out.println(Thread.currentThread().getName() + " run :" + i);
			try {
			sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		}
	}
}
