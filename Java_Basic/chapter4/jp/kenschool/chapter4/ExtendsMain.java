package jp.kenschool.chapter4;

public class ExtendsMain {
	
	public static void main(String[] args) {
	 Taxi taxi = new Taxi();
	 Taxi taxi1 = new Taxi();
	 Taxi taxi2 = new Taxi();
	 Car car1 = new Car();
	 Car car2 = new Car();
	 
	 //ポリモーフィズムの例　スーパークラスの要素でサブクラスを管理することができる
//	 Car[] cars = new Car[4];
//	 cars[0] = taxi1;
//	 cars[1] = car1;
//	 cars[2] = taxi2;
//	 cars[3] = car2;
//	 
//	 for(Car c : cars) {
//		 c.run();
//	 }
	 
	 
	 //スーパークラス(Car)から継承したメソッド
	 taxi.setData(4, 60);
	 taxi.disp();
	 
	 //サブクラス(Taxi)で定義したメソッド
	 taxi.setFare(1_000);
	 taxi.dispFare();
	 
	 //スーパークラス(Car)から継承したメソッドを
	 //サブクラス(Taxi)でオーバーライドしたメソッド
	 taxi.run();	 
	}
}
