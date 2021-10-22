package jp.kenschool.chapter7;

public class RunnableTest implements Runnable {
	
	private int count;
	
	@Override
	public void run() {
		count++;
		System.out.println("count = " + count);
	}
}
