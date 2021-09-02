package jp.kenschool.exercise4;

public abstract class AbstractPlayer {
	
	public abstract void play();
	public abstract void stop();
	
	public void electrify() {
		System.out.println("電気を使う");
	};
}
