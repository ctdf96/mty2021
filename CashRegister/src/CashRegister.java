import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int item1Price;
		int item1Count;
		int item2Price;
		int item2Count;
		int item3Price;
		int item3Count;

		System.out.println("商品1の金額を入力してください：\\");
		item1Price = sc.nextInt();

		System.out.println("商品1の数量を入力してください：");
		item1Count = sc.nextInt();

		System.out.println("商品2の金額を入力してください：\\");
		item2Price = sc.nextInt();

		System.out.println("商品2の数量を入力してください：");
		item2Count = sc.nextInt();

		System.out.println("商品3の金額を入力してください：\\");
		item3Price = sc.nextInt();

		System.out.println("商品3の数量を入力してください：");
		item3Count = sc.nextInt();

		int total = item1Price * item1Count + item2Price * item2Count + item3Price * item3Count;
		System.out.println("小計：\t\\"+ total);
		System.out.println("消費税：\\"+ total * 0.1);
		System.out.println("合計：\t\\"+(total)*1.1);
		System.out.println();
		
		int received;
		System.out.println("お預かり：\\");
		received = sc.nextInt();
		
		int change = received-total; 
		System.out.println("お釣り：\\"+ change);

	}}