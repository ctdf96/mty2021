package jp.kenschool.chapter7;

public class CallRunnableTest {

	public static void main(String[] args) {
		RunnableTest rt = new RunnableTest();
		Thread th = new Thread(rt);
		th.start();
		}

}
