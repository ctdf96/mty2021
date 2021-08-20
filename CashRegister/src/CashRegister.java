import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int item1Price,item2Price,item3Price;//金額
		int item1Count,item2Count,item3Count;//数量
		int total;//小計
		int tax;//消費税
		int received;//預り金

		/*
		番号を入力してください：
		１の場合は会計
		２の場合はシステム終了
		 */

		int inputNo;

		System.out.println("業務番号を入力してください。");
		System.out.println("1：会計");
		System.out.println("2：業務終了");

		inputNo = sc.nextInt();
		switch(inputNo) {
		case 1:

		System.out.println("商品1の金額を入力してください：\\");
		item1Price = sc.nextInt();

		if( item1Price < 0) {
			System.err.println("金額が不正です。システムを終了します。");
			System.exit(-1);
		}

		System.out.println("商品1の数量を入力してください：");
		item1Count = sc.nextInt();
		if( item1Count < 0) {
			System.err.println("数量が不正です。システムを終了します。");
			System.exit(-2);
		}

		System.out.println("商品2の金額を入力してください：\\");
		item2Price = sc.nextInt();

		if( item2Price < 0) {
			System.err.println("金額が不正です。システムを終了します。");
			System.exit(-1);
		}

		System.out.println("商品2の数量を入力してください：");
		item2Count = sc.nextInt();
		if( item2Count < 0) {
			System.err.println("数量が不正です。システムを終了します。");
			System.exit(-2);
		}

		System.out.println("商品3の金額を入力してください：\\");
		item3Price = sc.nextInt();

		if( item3Price < 0) {
			System.err.println("金額が不正です。システムを終了します。");
			System.exit(-1);
		}

		System.out.println("商品3の数量を入力してください：");
		item3Count = sc.nextInt();
		if( item3Count < 0) {
			System.err.println("数量が不正です。システムを終了します。");
			System.exit(-2);
		}

		total = item1Price * item1Count + item2Price * item2Count + item3Price * item3Count;
		System.out.println("小計：\t\\"+ total);

		tax =(int)(total * 0.1);

		System.out.println("消費税：\\"+ tax);
		System.out.println("合計：\t\\"+(total+tax));
		System.out.println();

		System.out.println("お預かり：\\");
		received = sc.nextInt();
		if( received < 0) {
			System.err.println("金額が不正です。システムを終了します。");
			System.exit(-3);}

		else if(received < (total+ tax)) {
			System.err.println("お預かり金額が合計金額より少ないです。システムを終了します。");
			System.exit(-4);}

		System.out.println("お釣り：\\"+ (received - (total+tax)));

		break;

	case 2:
		System.err.println("業務を終了します");
		System.exit(-4);
		break;

	default:
System.err.println("1または2以外の番号が入力されました。システムを終了します。");
System.exit(-5);
	}}}
