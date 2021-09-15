package cashregister;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//数字が入る前提

		//		データの準備
		//		Shop追加
		Shop shop1 = new Shop(1, "松山店", "愛媛県松山市", "090-1234-5678", 10_000);
		Shop shop2 = new Shop(2, "東垣生店", "松山市東垣生町", "090-9876-5432", 5_000);
		ArrayList<Shop> shops = new ArrayList<>();
		shops.add(shop1);
		shops.add(shop2);

		//		商品区分追加
		ItemKubun kubun1 = new ItemKubun(0, "食料品");
		ItemKubun kubun2 = new ItemKubun(1, "台所用品");
		ArrayList<ItemKubun> kubuns = new ArrayList<>();
		kubuns.add(kubun1);
		kubuns.add(kubun2);

		//		商品追加
		Item itm1 = new Item(1, "たけのこの里", kubun1, 200);
		Item itm2 = new Item(2, "ママレモン", kubun2, 300);
		ArrayList<Item> items = new ArrayList<>();
		items.add(itm1);
		items.add(itm2);

		//		従業員追加
		Employee emp1 = new Employee(1, "佐藤", 1);
		Employee emp2 = new Employee(2, "山本", 2);
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);

		//		売上記録
		ArrayList<Sales> sales = new ArrayList<>();
		
		
		//ログイン処理
		//ローカル変数はブロック内でしか使えないためブロックの外側で宣言
		int inputNo = 0;//入力された番号を入れる変数
		Employee emp = null;//見つかった社員情報を取り出すための変数empを用意
		boolean flg = false; //ログインチェック用フラグ（二択の場合はブーリアン型が使える）

		while (true) {
			do {//必ず一度はログインを試行するのでdo-while構文にする
				try {
						System.out.println("------ログイン------");
						System.out.print("従業員番号を入力してください：");
						inputNo = sc.nextInt();//キーボードから従業員番号を入力する
						System.out.println();

					//入力された番号が従業員番号にあるか調べる
					for (Employee e : emps) {//拡張for文でempArrayからEmployee型の変数を全て取り出す
						if (e.getEmpNo() == inputNo) {//eの従業員番号はprivateなので直接取得できない　ゲッターで取得して比較
							flg = true;//見つかったらフラグにtrueを代入
							emp = e;//見つかった時にだけempの中に入れる
							break;//番号が見つかった場合はそれ以上検索する必要がないのでループを抜ける
							
						} else {//見つからなかった場合は
							flg = false;//フラグにfalseを代入してブロックを抜ける
						}
					}

					if (flg == false) {//番号が見つからなかった（false）の場合、メッセージ表示
						System.err.println("従業員番号が存在しません");
						System.out.println();//くっついてると読みづらいのでスペーサー
					}
					
				} catch (InputMismatchException e) {//文字が入力される場合に備える エラーが発生したらキャッチ
					System.err.println("従業員番号は整数で入力してください");
					System.out.println();
					System.out.println();//改行が読み捨てられるためダミー行を追加
					sc.next();//Scannerのバッファを読み捨てる処理
				}

			} while (flg == false);//フラグがfalse（従業員番号が見つからない）の間繰り返す

			
			// キャッシュレジスターシステム
			do {
				//メニュー画面表示
				emp.dispMenu();//従業員クラスにメニュー表示用のメソッドを作成し、
								//自分のランクを見て表示するメニューを呼び出す
				System.out.println();
				System.out.println("メニュー番号を入力してください：");
				inputNo = sc.nextInt();//メニュー番号を入力
//------------------------------------------------------------------------------------------------------					

					// メニュー実行
					emp.execute(inputNo, items, sales);//従業員クラスにメニューを実行するメソッドを作成し、
					//入力された番号に対応した処理を行う

//					//会計処理をさせる
//					int itemNo = 0;
//					if (inputNo == 1) {
//						//					total = 0;//小計をリセット
//						//
//						//do {
//					while (true) { // true の間　繰り返す
//						System.out.print("商品コードを入力してください：");
//						inputNo = sc.nextInt();
//						System.out.println();
//
//						//商品コードを検索して、金額を調べる
//						for (Item i : items) {//拡張for文
//							if (i.getItemNo() == inputNo) {
//								System.out.println("商品コード（" + inputNo + "）" + i.getItemName() + "は１個 "
//										+ i.getPrice() + "円です");
//
//								//数量を入力
//								//商品ID、商品名、数量を画面に表示
//								//次の商品がある？
//								//								あるなら次の商品
//								//								ないなら割引額の有り無しを確認
//								//								あるなら割引
//								//								ないならそのまま計算
//								//								レジ袋の有無を確認、いるなら袋代３円追加
//								//お客様から金額を入力されたらお釣りを表示
//								
//							}
//							}
//						}
////					System.out.println();
////					System.out.println("商品コードが見つかりません");
////					System.out.println();	
//					
//					}System.out.println();
////								System.out.println("会計処理を終了します");
////								System.out.println();
////								break;
//						//						while(true) {
//						//
//						//						}
//						//					if (itemPrice < 0) {
//						//						System.err.println("金額が不正です。システムを終了します。");
//						//						System.exit(-1);
//						//					}
//						//
//						//					System.out.println("商品1の数量を入力してください：");
//						//					
//						//
//						//											}while(inputNo == 1);
//
//					}
//				

//------------------------------------------------------------------------------------------------------					

			} while (inputNo != 4);//フラグがfalseの間繰り返す
			
			
			System.out.println();
			System.out.println();

		}
	}}