
import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		
		
		ItemKubun kubun1 = new ItemKubun(1, "食品");
		Item item1 = new Item(1, "ソーセージ",kubun1,200);
		item1.kubun1.kubunName;
	}
		Scanner sc = new Scanner(System.in);

		int itemPrice = 0;//商品金額　見つからなかったら０円にしている
		int itemNo;//商品番号
		int itemCount;//商品数量
		int total;//小計
		int tax;//消費税
		int received;//預り金額
		int inputNo; //入力番号
//		int ItemCodeArray[] = { 1, 2, 3, 4, 5 }; //商品コード一覧
//		int ItemPriceArray[] = { 100, 300, 500, 180, 1000}; //商品価格一覧
		
		//itemを入れられる商品クラス(item.java側で)を作り、配列にそれぞれの商品データを入れて商品一覧を初期化する
		Item items[] = {
				new Item(1,"きのこの山",150),	//newでインスタンス化する
				new Item(2,"たけのこの里",200),
				new Item(3,"パイの実",300)};


		while(true) {//無限ループ
			
		//メニュー画面表示
		System.out.println("------------------------------");
		System.out.println("キャッシュレジスター メニュー");
		System.out.println("1：お会計");
		System.out.println("2：売上管理");
		System.out.println("3：在庫管理");
		System.out.println("4：業務終了");
		System.out.println("------------------------------");

		//		メニュー番号
		inputNo = sc.nextInt();
		switch (inputNo) {

		//会計処理　total += itemPrice * itemCount;
		case 1:
//			何番目の商品かカウント
			int count = 1;
			total = 0;//小計をリセット
			
			do {
				while (true) { // true の間　繰り返す
			System.out.println("商品コードを入力してください：\\");
			itemNo = sc.nextInt();
			//商品コードを検索して、金額を調べる
			int i;
			for(i = 0; i < ItemCodeArray.length; i++) {
				if(ItemCodeArray[i] ==itemNo) {
					itemPrice = ItemPriceArray[i];
					break;
				}
			}
			if (i == ItemCodeArray.length) {
				System.out.println("商品が見つかりませんでした。");
			} else {
				break;
			}
				}
				
				while(true) {
					
				}
			if (itemPrice < 0) {
				System.err.println("金額が不正です。システムを終了します。");
				System.exit(-1);
			}

			System.out.println("商品1の数量を入力してください：");
			itemCount = sc.nextInt();
			if (itemCount < 0) {
				System.err.println("数量が不正です。システムを終了します。");
				System.exit(-2);
				
			}while(inputNo == 1);

//-----------------------------------------------------------------------------------			
			//小計の表示		
			System.out.println("小計：\t\\" + total);

//			消費税の計算と表示
			tax = (int) (total * 0.1);
			System.out.println("消費税：\\" + tax);
//			合計金額の表示
			System.out.println("合計：\t\\" + (total + tax));
			System.out.println();

//			預かり金額の入力
			System.out.println("お預かり：\\");
			received = sc.nextInt();
			if (received < 0) {
				System.err.println("金額が不正です。システムを終了します。");
				System.exit(-1);
			}

			else if (received < (total + tax)) {
				System.err.println("お預かり金額が合計金額より少ないです。システムを終了します。");
				System.exit(-2);
			}

			System.out.println("お釣り：\\" + (received - (total + tax)));

			break;

		//システム終了
		case 2:
			System.err.println("システムを終了します。");
			//入力ストリームのクローズ
			sc.close();
			System.exit(0);

		//メニュー再表示
		default:
			System.out.println("1または2以外の番号が入力されました。正しい番号を入力してください。");
			}
		}