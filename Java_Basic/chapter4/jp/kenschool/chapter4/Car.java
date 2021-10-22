package jp.kenschool.chapter4;
//車
public class Car {
	private int fuel;//燃料
	private int speed;//速度
	
	//データ設定
	public void setData(int fuel, int speed) {
		this.fuel = fuel;
		this.speed = speed;
		}
	
	//燃料、速度表示
	public void disp() {
		System.out.println("燃料は、" + fuel + "リットル");
		System.out.println("速度は、" + speed + "km");
	}
	
	public void run() {
		System.out.println("走る");
	}
}
