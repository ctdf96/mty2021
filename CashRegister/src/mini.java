package cashregister;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//数字が入る前提
		
//		従業員追加
		Employee emp1 = new Employee(1, "佐藤", 0);
		Employee emp2 = new Employee(2, "山本", 1);
		
		ArrayList<Employee> empArray = new ArrayList<>();
		empArray.add(emp1);
		empArray.add(emp2);
		
//		アルバイト追加
//		PartTime prt1 = new PartTime(3, "吉田", 1);
//		PartTime prt2 = new PartTime(4, "田中", 1);
//		
//		ArrayList<PartTime> prtArray = new ArrayList<>();
//		prtArray.add(prt1);
//		prtArray.add(prt2);
		
//		ItemKubun追加
		ItemKubun kubun1 = new ItemKubun(0, "食料品");
		ItemKubun kubun2 = new ItemKubun(1, "台所用品");
		ArrayList<ItemKubun> kbnArray = new ArrayList<>();
		kbnArray.add(kubun1);
		kbnArray.add(kubun2);
				
		
//		Item追加
		Item itm1 = new Item(1,"たけのこの里", kubun1 , 200);
		Item itm2 = new Item(1,"ママレモン", kubun2 , 300);
		ArrayList<Item> itmArray = new ArrayList<>();
		itmArray.add(itm1);
		itmArray.add(itm2);
		
//		Shop追加
		Shop shop1 = new Shop(1, "松山店", "愛媛県松山市","090-1234-5678", 10_000);
		Shop shop2 = new Shop(2, "東垣生店","松山市東垣生町","090-9876-5432",5_000);
		ArrayList<Shop> shopArray = new ArrayList<>();
		shopArray.add(shop1);
		shopArray.add(shop2);
		
		
		//ログイン処理
		//ローカル変数はブロック内でしか使えないためブロックの外側で宣言
		int inputNo = 0;//入力された番号を入れる変数
		boolean flg = false; //フラグ用　二択の場合はブーリアン型が使える		
	
		do {//必ず一度はログインを試行するのでdo-while構文にする			
			try {
				System.out.println("------ログイン------");
				System.out.print("従業員番号を入力してください：");
			
			inputNo = sc.nextInt();//キーボードから従業員番号を入力する
	
			//入力された番号が従業員番号にあるか調べる
			for(Employee e : empArray) {//拡張for文でempArrayからEmployee型の変数を全て取り出す
				if(e.getEmpNo() == inputNo) {//eの従業員番号はprivateなので直接取得できない
					flg = true;//見つかったらフラグにtrueを代入
					break;//番号が見つかった場合はそれ以上検索する必要がないのでループを抜ける
				} else {//見つからなかった場合は
					flg = false;//フラグにfalseを代入してブロックを抜ける
				}
			}			
			if(flg == false) {//番号が見つからなかった（false）の場合、メッセージ表示
				System.err.println("従業員番号が存在しません");
				System.out.println();//くっついてると読みづらいのでスペーサー
			}
		}
			catch(InputMismatchException e) {//文字が入力される場合に備える
				 System.err.println("従業員番号は整数で入力してください");
				 
				 //改行が読み捨てられるためダミー行を追加
				 System.out.println();
				 //Scannerのバッファを読み捨てる処理
				 sc.next();
				}
			
		} while (flg == false);//フラグがfalseの間繰り返す

				
//			// キャッシュレジスターシステム
//			//メニュー画面表示
			System.out.println("------------------------------");
			System.out.println("キャッシュレジスター メニュー");
			System.out.println("1：お会計");
			System.out.println("2：売上管理");//未実装
			System.out.println("3：在庫管理");//未実装
			System.out.println("4：ログアウト");
			System.out.println("------------------------------");

			flg = false;
			
		do {
			try{
			System.out.println("メニュー番号を入力してください");
			inputNo = sc.nextInt();//メニュー番号を入力
			
		switch (inputNo) {
		case 1:
			System.out.println("会計処理を行います");
			//会計処理　total += itemPrice * itemCount;
			break;

		case 2:
			System.err.println("売上管理機能は未実装です。他の番号を入力してください");
			System.out.println();
			break;
		
		case 3:
			System.err.println("在庫管理機能は未実装です。他の番号を入力してください");
			System.out.println();
			break;
			
		case 4:
			System.err.println("ログアウトしてログイン画面に戻ります。");
			System.exit(0);	
		//ログイン画面に戻るには？			
			
		default:
			System.err.println("1～4の範囲で入力してください");
			System.out.println();}}
			
			catch(InputMismatchException e) {//文字が入力される場合に備える エラーが発生したらキャッチ
				 System.err.println("メニュー番号は1～4の整数で入力してください");
				 System.out.println();
				 
				 //改行が読み捨てられるためダミー行を追加
				 System.out.println();
				 //Scannerのバッファを読み捨てる処理
				 sc.next();
				}			
		} while (flg == false);//フラグがfalseの間繰り返す
		sc.close();//入力ストリームのクローズ
	}
}
