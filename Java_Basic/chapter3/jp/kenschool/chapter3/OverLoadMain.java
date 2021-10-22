package jp.kenschool.chapter3;

import java.util.Scanner;

public class OverLoadMain {

	public static void main(String[] args) {
		Shopping shop = new Shopping();
	
//		shop. buy(300);
//		shop. buy(300,5);
	
	Scanner sc = new Scanner(System.in);
	System.out.print("金額を入力：");
	int price = sc.nextInt();
	System.out.print("数量を入力：");
	int quantity = sc.nextInt();
	
	if(quantity == 1) {
		shop.buy(price);
		
	} else if(quantity > 1){
		shop.buy(price, quantity);
	}
	sc.close();
	}}
