package cashregister;

public class Operating {
//	会計メソッド
	public void operate() {
		//商品IDを入力
		//数量を入力
		//商品ID、商品名、数量を画面に表示
		//次の商品がある？
//		あるなら次の商品
//		ないなら割引額の有り無しを確認
//		あるなら割引
//		ないならそのまま計算
//		レジ袋の有無を確認、いるなら袋代３円追加
	//お客様から金額を入力されたらお釣りを表示
		
//	
//		何番目の商品かカウント
//		int count = 1;
//		total = 0;//小計をリセット
//		
//		do {
//			while (true) { // true の間　繰り返す
//		System.out.println("商品コードを入力してください：\\");
//		itemNo = sc.nextInt();
//		//商品コードを検索して、金額を調べる
//		int i;
//		for(i = 0; i < ItemCodeArray.length; i++) {
//			if(ItemCodeArray[i] ==itemNo) {
//				itemPrice = ItemPriceArray[i];
//				break;
//			}
//		}
//		if (i == ItemCodeArray.length) {
//			System.out.println("商品が見つかりませんでした。");
//		} else {
//			break;
//		}
//			}
//			
//			while(true) {
//				
//			}
//		if (itemPrice < 0) {
//			System.err.println("金額が不正です。システムを終了します。");
//			System.exit(-1);
//		}
//
//		System.out.println("商品1の数量を入力してください：");
//		itemCount = sc.nextInt();
//		if (itemCount < 0) {
//			System.err.println("数量が不正です。システムを終了します。");
//			System.exit(-2);
//			
//		}while(inputNo == 1);
//
////-----------------------------------------------------------------------------------			
//		//小計の表示		
//		System.out.println("小計：\t\\" + total);
//
////		消費税の計算と表示
//		tax = (int) (total * 0.1);
//		System.out.println("消費税：\\" + tax);
////		合計金額の表示
//		System.out.println("合計：\t\\" + (total + tax));
//		System.out.println();
//
////		預かり金額の入力
//		System.out.println("お預かり：\\");
//		received = sc.nextInt();
//		if (received < 0) {
//			System.err.println("金額が不正です。システムを終了します。");
//			System.exit(-1);
//		}
//
//		else if (received < (total + tax)) {
//			System.err.println("お預かり金額が合計金額より少ないです。システムを終了します。");
//			System.exit(-2);
//		}
//
//		System.out.println("お釣り：\\" + (received - (total + tax)));
//
//	}
}}
