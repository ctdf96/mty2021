package jp.kenschool.chapter3;

public class Shopping {
	public void buy(int price) {
		System.out.println("商品１つは：" + price + "円です。");
	}
	public void buy(int price,int quantity) {
		System.out.println("商品" +quantity + "つの合計は：" + price*quantity + "円です。");
		}	
	}